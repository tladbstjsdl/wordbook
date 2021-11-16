package com.wordbook.dummy.user.repository

import com.wordbook.dummy.user.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<Long, User> {}