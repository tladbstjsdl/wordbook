package com.wordbook.dummy.user.service

import com.google.gson.JsonObject
import com.wordbook.dummy.user.dto.UserDto
import com.wordbook.dummy.user.entity.User
import com.wordbook.dummy.user.repository.UserMapper
import com.wordbook.dummy.utility.JsonUtility
import org.apache.logging.log4j.util.Strings
import org.springframework.stereotype.Service

@Service
class UserService(val mapper :UserMapper) : JsonUtility() {
	fun find(params :String, user :User) : UserDto{
		val json = fromJson(params, JsonObject::class.java)
		
		val email :String = getStringFromJson(json, "email") ?: Strings.EMPTY //throw 예정

		return mapper.findByEmail(email)
	}
}