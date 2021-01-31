package com.dummy.wordbook.member.service

import com.dummy.wordbook.member.entity.Member
import org.springframework.security.core.userdetails.UserDetailsService

interface MemberService : UserDetailsService {
    fun findByMemberId(memberId: String): Member?
    fun save(member: Member)
}
