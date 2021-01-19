package com.dummy.wordbook.member.service

import com.dummy.wordbook.member.entity.Member

/*
import com.dummy.wordbook.user.dto.MemberDto
import com.dummy.wordbook.user.mapper.MemberMapper
import org.springframework.stereotype.Service

@Service
class MemberService(private val memberMapper: MemberMapper) : MemberMapper {
    override fun selectMemberById(id: Int): MemberDto {
        return memberMapper.selectMemberById(id)
    }

    override fun selectMemberByMemberId(memberId: String): MemberDto {
        return memberMapper.selectMemberByMemberId(memberId)
    }

    override fun updateMemberPassword(id: Int, password: String) {
        memberMapper.updateMemberPassword(id, password)
    }

    override fun updateMemberEmail(id: Int, email: String) {
        memberMapper.updateMemberEmail(id, email)
    }

    override fun updateMemberPhone(id: Int, phone: String) {
        memberMapper.updateMemberPhone(id, phone)
    }

    override fun updateMemberAddress(id: Int, address: String?) {
        memberMapper.updateMemberAddress(id, address)
    }

    override fun updateMemberCertified(id: Int, certified: Int) {
        memberMapper.updateMemberCertified(id, certified)
    }

    override fun insertMember(memberDto: MemberDto) {
        memberMapper.insertMember(memberDto)
    }
}*/
interface MemberService {
    public fun findByMemberId(memberId: String): Member?
    public fun save(member: Member)
}
