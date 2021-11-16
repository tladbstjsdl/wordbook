package com.wordbook.dummy.notice.entity

import org.apache.logging.log4j.util.Strings
import java.util.*
import javax.persistence.*

@Entity
data class NoticeFile(
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(length = 20, unique = true, updatable = false)
	private var id :Long? = null,
	private var originalName :String = Strings.EMPTY,
	private var savedName :String = Strings.EMPTY,
	private var savedPath :String = Strings.EMPTY,
	@Column(updatable = false)
	private var regDate :Date? = null,
	@Column(updatable = false)
	private var regId :String = Strings.EMPTY,
	private var upDate :Date? = null,
	private var upId :String = Strings.EMPTY,
	private var used :Boolean = true
)