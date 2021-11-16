package com.wordbook.dummy.utility

import org.springframework.http.HttpStatus

data class Response (
		val status :HttpStatus,
		var data :Any?,
		var length :Long?,
		var page :Long?,
		var size :Int?,
		val isSuccess :Boolean = (status.value() in 200..299)
) {
	constructor(status :HttpStatus) : this(status, null, null, null, null)
	constructor(status :HttpStatus, data :Any) : this(status, data, null, null, null)
	constructor(status :HttpStatus, data :Any, length :Long) : this(status, data, length, null, null)
}