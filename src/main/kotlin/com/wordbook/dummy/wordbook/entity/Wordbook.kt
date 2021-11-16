package com.wordbook.dummy.wordbook.entity

import com.wordbook.dummy.user.entity.User
import lombok.Builder
import lombok.Getter
import lombok.ToString
import org.apache.logging.log4j.util.Strings
import java.util.*
import javax.persistence.*

@Entity
data class Wordbook(
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) private var id :Long? = null,
	private var title :String = Strings.EMPTY,
	private var favorite :Boolean = false,
	@Column(updatable = false)
	private var regDate :Date? = null,
	@Column(updatable = false)
	private var regId :String = Strings.EMPTY,
	private var upDate :Date? = null,
	private var upId :String = Strings.EMPTY,
	private var used :Boolean = true,
	
	private var shared :Boolean = false,
	@OneToMany
	private var sharedUsers :List<User>? = null
){}