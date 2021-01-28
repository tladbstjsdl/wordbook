package com.dummy.wordbook.member.service

import com.dummy.wordbook.member.entity.Member
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

interface MemberService : UserDetailsService {
    public fun findByMemberId(memberId: String): Member?
    public fun findByMemberIdAndPassword(memberId: String, password: String): Member?
    public fun save(member: Member)
}
