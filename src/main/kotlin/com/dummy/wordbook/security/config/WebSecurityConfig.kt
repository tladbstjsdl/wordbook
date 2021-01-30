package com.dummy.wordbook.security.config

import com.dummy.wordbook.member.service.MemberService
import org.springframework.boot.autoconfigure.security.servlet.PathRequest
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.security.crypto.factory.PasswordEncoderFactories
import org.springframework.security.crypto.password.PasswordEncoder

@Configuration
@EnableWebSecurity
class WebSecurityConfig(private val memberService: MemberService) : WebSecurityConfigurerAdapter() {
	@Bean
	public fun passwordEncoder(): PasswordEncoder {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder()
	}

	override fun configure(web: WebSecurity?) {
		web?.ignoring()?.requestMatchers(PathRequest.toStaticResources().atCommonLocations());
	}

	override fun configure(http: HttpSecurity?) {
		http?.csrf()?.disable()?.authorizeRequests()
			?.antMatchers("/", "/insertForm")?.permitAll()
			?.antMatchers("/wordbook", "/wordbooklist")?.authenticated()
			?.antMatchers("/notice/insert")?.hasRole("admin")
			?.and()
		?.formLogin()
			?.loginPage("/")
			?.defaultSuccessUrl("/")
			?.permitAll()
			?.usernameParameter("memberId")
			?.and()
		?.logout()
			?.invalidateHttpSession(true)
	}

	override fun configure(auth: AuthenticationManagerBuilder?) {
		auth?.userDetailsService(memberService)?.passwordEncoder(passwordEncoder())
	}

}