package com.dummy.wordbook.member.entity

import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.PrePersist
import javax.persistence.PreUpdate
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
	var id: Long?,
	@Column(unique = true, nullable = false, length = 15)
	val memberId: String,
	@Column(nullable = false)
	var password: String,
	@Column(unique = true, nullable = false)
	val email: String,
	@Column(unique = true, nullable = false)
	val phone: String,
	var address: String?,
	@Column(insertable = false, updatable = false, columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	var regDate: Date?,
	@Column(nullable = false, columnDefinition = "NUMBER(1,0) DEFAULT 0")
	var certified: Byte?
) {
	override fun hashCode(): Int {
		return 1
	}

	constructor(memberId: String, password: String, email: String, phone: String, address: String?)
	: this(null, memberId, password, email, phone,address, null,  null)

	@PrePersist
	@PreUpdate
	fun prePersistUpdate() {
		this.certified = this.certified?: 0
	}
}