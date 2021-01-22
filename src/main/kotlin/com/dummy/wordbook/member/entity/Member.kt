package com.dummy.wordbook.member.entity

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.SequenceGenerator

@Entity
/*@SequenceGenerator(name="MEMBER_SEQ_GENERATOR",
	sequenceName="MEMBER_SEQ",
	initialValue=21,
	allocationSize=1
)*/
data class Member(
	/*@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEMBER_SEQ_GENERATOR")*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Long?,
	@Column(unique = true, nullable = false, length = 15)
	var memberId: String,
	@Column(nullable = false, length = 20)
	var password: String,
	@Column(unique = true, nullable = false)
	var email: String,
	@Column(unique = true, nullable = false)
	var phone: String,
	var address: String?,
	@Column(insertable = false, updatable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	val regDate: Date?,
	@Column(nullable = false, columnDefinition = "number(2,0) default 0")
	val certified: Byte?
) {
	override fun hashCode(): Int {
		return 1
	}

	constructor(memberId: String, password: String, email: String, phone: String, address: String?)
	: this(null, memberId, password, email, phone,address, null,  null)
}