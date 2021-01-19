package com.dummy.wordbook.member.service

import com.dummy.wordbook.member.entity.Member
import com.dummy.wordbook.member.entity.MemberRepository
import org.springframework.stereotype.Service

@Service
class MemberServiceImpl(private val memberRepository: MemberRepository) : MemberService {
	override fun findByMemberId(memberId: String): Member? {
		return memberRepository.findByMemberId(memberId)
	}

	override fun save(member: Member) {
		memberRepository.save(member)
	}
}