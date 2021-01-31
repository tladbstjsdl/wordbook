package com.dummy.wordbook.member.service

import com.dummy.wordbook.member.entity.Member
import com.dummy.wordbook.member.entity.MemberRepository
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.stereotype.Service

@Service
class MemberServiceImpl(private val memberRepository: MemberRepository) : MemberService {
	override fun findByMemberId(memberId: String): Member? {
		return memberRepository.findByMemberId(memberId)
	}

	override fun save(member: Member) {
		memberRepository.save(Member(member.memberId, member.password,
			member.email, member.phone, member.address))
	}

	override fun loadUserByUsername(username: String?): UserDetails {
		val authority: MutableList<GrantedAuthority> = ArrayList()
		val member = findByMemberId(username!!)?: Member("", "", "", "", null)
		member.certified.let { certified ->
			if(certified!!.toInt() == 2) authority.add(SimpleGrantedAuthority("ROLE_ADMIN"))
			else authority.add(SimpleGrantedAuthority("ROLE_MEMBER"))
		}

		return User(username, member.password, authority)
	}
}