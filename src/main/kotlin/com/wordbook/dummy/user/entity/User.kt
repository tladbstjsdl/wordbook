package com.wordbook.dummy.user.entity

import lombok.Builder
import lombok.Getter
import lombok.ToString
import org.apache.logging.log4j.util.Strings
import java.util.*
import javax.persistence.*

@Entity
data class User(
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(length = 20, unique = true, updatable = false)
	private var id :Long? = null,
	@Column(updatable = false)
	private var email :String = Strings.EMPTY,
	private var password :String = Strings.EMPTY,
	private var name :String = Strings.EMPTY,
	@Column(updatable = false)
	private var regDate :Date? = null,
	@Column(updatable = false)
	private var regId :String = Strings.EMPTY,
	private var upDate :Date? = null,
	private var upId :String = Strings.EMPTY,
	private var used :Boolean = true
)