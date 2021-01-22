package com.dummy.wordbook.member.entity

import org.springframework.data.jpa.repository.JpaRepository

interface MemberRepository : JpaRepository<Member, Long>{
	public fun findByMemberId(memberId: String): Member?
	public fun findByMemberIdAndPassword(memberId: String, password: String): Member?
}