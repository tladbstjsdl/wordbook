package com.wordbook.dummy.notice.entity

import org.apache.logging.log4j.util.Strings
import java.util.*
import javax.persistence.*

@Entity
data class Notice(
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(length = 20, unique = true, updatable = false)
	private var id :Long? = null,
	private var title :String = Strings.EMPTY,
	private var content :String = Strings.EMPTY,
	private var authority :Byte = 0,
	private var opened :Boolean = true,
	@Column(updatable = false)
	private var regDate :Date? = null,
	@Column(updatable = false)
	private var regId :String = Strings.EMPTY,
	private var upDate :Date? = null,
	private var upId :String = Strings.EMPTY,
	private var used :Boolean = true
)