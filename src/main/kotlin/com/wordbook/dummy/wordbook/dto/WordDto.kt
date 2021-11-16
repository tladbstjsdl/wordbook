package com.wordbook.dummy.wordbook.dto

import lombok.Getter
import lombok.Setter
import lombok.ToString
import org.apache.logging.log4j.util.Strings

@Getter
@Setter
@ToString
class WordDto() {
	private var eng :String = Strings.EMPTY;
	private var kor :String = Strings.EMPTY;

	constructor(eng :String, kor :String) : this() {
		this.eng = eng;
		this.kor = kor;
	}
}