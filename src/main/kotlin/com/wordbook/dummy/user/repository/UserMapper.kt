package com.wordbook.dummy.user.repository

import com.wordbook.dummy.user.dto.UserDto
import org.apache.ibatis.annotations.Mapper

@Mapper
interface UserMapper {
	fun findByEmail(email :String) :UserDto;
	fun findByEmailAndPassword(email :String, password :String) :UserDto;
}