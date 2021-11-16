package com.wordbook.dummy.user.dto

import lombok.Getter
import lombok.Setter
import lombok.ToString
import org.apache.logging.log4j.util.Strings
import java.util.*

@Getter
@Setter
@ToString
class UserDto(
		private var id :Long? = null,
		private var email :String = Strings.EMPTY,
		private var password :String = Strings.EMPTY,
		private var name :String = Strings.EMPTY,
		private var regDate :Date? = null,
		private var regId :String = Strings.EMPTY,
		private var upDate :Date? = null,
		private var upId :String = Strings.EMPTY,
)