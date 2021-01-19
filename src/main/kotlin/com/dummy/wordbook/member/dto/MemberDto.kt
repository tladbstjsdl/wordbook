package com.dummy.wordbook.member.dto

import com.dummy.wordbook.member.entity.Member
import java.util.*

data class MemberDto(
	val id: Long?,
    val memberId: String,
	val password: String,
	val email: String,
	val phone: String,
	val address: String?,
	val regDate: Date?,
	val certified: Boolean?
) {
	constructor(memberId: String, password: String, email: String, phone: String, address: String?)
	: this(null, memberId, password, email, phone, address, null, null)

	public fun toEntity(): Member {
		return Member(this.memberId, this.password, this.email, this.phone, this.address)
	}
}