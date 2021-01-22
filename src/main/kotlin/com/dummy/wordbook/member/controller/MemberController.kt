package com.dummy.wordbook.member.controller

import com.dummy.wordbook.member.dto.MemberDto
import com.dummy.wordbook.member.service.MemberService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import javax.servlet.http.HttpServletRequest

@Controller
class MemberController(private val memberService: MemberService) {
	@RequestMapping("/")
	public fun indexPage(m: Model): String {
		memberService.findByMemberId("qwe")?.let {loginMember ->
			m.addAttribute("loginMember", loginMember)
			m.addAttribute("memberDto", MemberDto("", "",
				"", "", null))
		}

		return "index"
	}

	@PostMapping("/insertMember")
	public fun insertMember(req: HttpServletRequest, m: Model): String {
		var memberId: String = req.getParameter("memberId")
		memberService.save(MemberDto(null, memberId, req.getParameter("password"),
			req.getParameter("email"), req.getParameter("phone"), req.getParameter("address"),
			null, null).toEntity()).run {
				m.addAttribute("newMember", memberService.findByMemberId(memberId))
		}

		return "insertComplete"
	}
}
    /*@RequestMapping("/")
    public fun indexPage(req: HttpServletRequest, m: Model): String {
        var idParam: String? = req.getParameter("id")
        if(idParam != null && idParam.toIntOrNull() != null) {
            println("ID: " + idParam.toInt())
            var loginedMember: MemberDto = memberService.selectMemberById(idParam.toInt())
            m.addAttribute("member", loginedMember)
            m.addAttribute("memberForm", MemberForm())
            println("member = $loginedMember")
        }
        return "index"
    }

    @PostMapping("/insertMember")
    public fun insertMember(req: HttpServletRequest, m: Model, memberForm: MemberForm): String {
        *//*val newMember: MemberDto = MemberDto(null, memberForm.memberId!!
                , req.getParameter("password"), req.getParameter("email")
                , req.getParameter("phone"), req.getParameter("address")
                , null, 0)
        memberService.insertMember(newMember).run {
            m.addAttribute("newMember", memberService.selectMemberByMemberId(newMember.memberId))
        }*//*
        val newMember: MemberDto = MemberDto(null, memberForm.memberId!!
                , memberForm.password!!, memberForm.email!!, memberForm.phone!!
                , when(memberForm.address.isNullOrBlank()) {
                    true -> null
                    else -> memberForm.address
                }, null, 0)
        memberService.insertMember(newMember).run {
            m.addAttribute("newMember", memberService.selectMemberByMemberId(newMember.memberId))
        }
        return "insertComplete"
    }*/
