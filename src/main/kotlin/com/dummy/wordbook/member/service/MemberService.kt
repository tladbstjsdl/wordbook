package com.dummy.wordbook.member.service

import com.dummy.wordbook.member.entity.Member

interface MemberService {
    public fun findByMemberId(memberId: String): Member?
    public fun findByMemberIdAndPassword(memberId: String, password: String): Member?
    public fun save(member: Member)
}
