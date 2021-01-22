package com.dummy.wordbook

import com.dummy.wordbook.member.entity.Member
import com.dummy.wordbook.member.service.MemberService
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WordbookApplication(private val memberService: MemberService) : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        memberService.save(Member(null, "dummy", "123", "dummy@asd.com", "000-1111-2222",
            "qwrasf", null, 2))
        memberService.save(Member(null, "qwe", "123", "qwe@asd.com", "000", "qwrasf",
            null, 0))
    }
}

fun main(args: Array<String>) {
    runApplication<WordbookApplication>(*args)
}
