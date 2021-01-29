package com.dummy.wordbook.member.controller

import com.dummy.wordbook.member.dto.MemberDto
import com.dummy.wordbook.member.entity.Member
import com.dummy.wordbook.member.service.MemberService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpSession

@Controller
class MemberController(private val memberService: MemberService) {
	@RequestMapping("/")
	public fun indexPage(m: Model, session: HttpSession): String {
		if(session.getAttribute("loginMember") == null) {
			m.addAttribute("memberDto", MemberDto(null, "", "", null, null, null, null, 0))
		}
		return "index"
	}

	@PostMapping("/loginConfirm")
	@ResponseBody
	public fun loginConfirm(memberDto: MemberDto, session: HttpSession): String {
		val memberId: String = memberDto.memberId
		val password: String = memberDto.password

		memberService.findByMemberId(memberId)?.run {
			memberService.findByMemberIdAndPassword(memberId, password)?.let { loginMember ->
				session.setAttribute("loginMember", loginMember)
				return "loginSuccess"
			}
			return "passwordError"
		}
		return "memberIdError"
	}

	@PostMapping("/insertForm")
	public fun insertForm(m: Model): String {
		m.addAttribute("memberDto", MemberDto("", "",
			"", "", null))
		return "insertForm"
	}

	@PostMapping("/insertMember")
	public fun insertMember(req: HttpServletRequest, m: Model): String {
		val memberId: String = req.getParameter("memberId")
		memberService.save(Member(memberId, req.getParameter("password"),
			req.getParameter("email"), req.getParameter("phone"), req.getParameter("address"))).run {
				m.addAttribute("newMember", memberService.findByMemberId(memberId))
		}

		return "insertComplete"
	}
}
