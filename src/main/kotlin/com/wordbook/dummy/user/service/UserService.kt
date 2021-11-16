package com.wordbook.dummy.user.service

import com.wordbook.dummy.user.dto.UserDto
import com.wordbook.dummy.user.entity.User
import com.wordbook.dummy.user.repository.UserMapper
import org.springframework.stereotype.Service

@Service
class UserService(mapper :UserMapper) {
	val mapper = mapper;
	fun find(params :String, user :User) :Unit {
		return mapper.findByEmail(UserDto());
	}
}