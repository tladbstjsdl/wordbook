package com.wordbook.dummy.user.repository

import com.wordbook.dummy.user.dto.UserDto
import org.apache.ibatis.annotations.Mapper

@Mapper
interface UserMapper {
	public fun findByEmail(dto :UserDto);
	public fun findByEmailAndPassword(dto :UserDto);
}