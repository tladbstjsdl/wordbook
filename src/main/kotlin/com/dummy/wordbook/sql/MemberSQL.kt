package com.dummy.wordbook.sql

import com.dummy.wordbook.member.dto.MemberDto
import kotlin.text.StringBuilder

class MemberSQL {
	private val query: StringBuilder = StringBuilder("")
	fun selectMemberById(id: Int): String {
		if(query.isNotBlank()) {
			query.clear()
		}
		query.append("select * from member ")
		query.append("where id = #{id}")
		return query.toString()
	}

	fun selectMemberByMemberId(memberId: String): String {
		if(query.isNotBlank()) {
			query.clear()
		}
		query.append("select * from member ")
		query.append("where member_id = #{memberId}")
		return query.toString()
	}

	fun updateMemberPassword(id: Int, password: String): String {
		if(query.isNotBlank()) {
			query.clear()
		}
		query.append("update member set ")
		query.append("password = #{password} where id = #{id}")
		return query.toString()
	}

	fun updateMemberEmail(id: Int, email: String): String {
		if(query.isNotBlank()) {
			query.clear()
		}
		query.append("update member set ")
		query.append("email = #{email} where id = #{id}")
		return query.toString()
	}

	fun updateMemberPhone(id: Int, phone: String): String {  //나중에 phone format 확인하기
		if(query.isNotBlank()) {
			query.clear()
		}
		query.append("update member set ")
		query.append("phone = #{phone} where id = #{id}")
		return query.toString()
	}

	fun updateMemberAddress(id: Int, address: String): String {
		if(query.isNotBlank()) {
			query.clear()
		}
		query.append("update member set ")
		query.append("address = #{address} where id = #{id}")
		return query.toString()
	}

	fun updateMemberCertified(id: Int, certified: Int): String {
		if(query.isNotBlank()) {
			query.clear()
		}
		query.append("update member set ")
		query.append("certified = #{certified} where id = #{id}")
		return query.toString()
	}

	fun insertMember(memberDto: MemberDto): String {
		if(query.isNotBlank()) {
			query.clear()
		}
		query.append("insert into member (ID, MEMBER_ID, PASSWORD, " +
				"EMAIL, PHONE, ADDRESS) ")
		query.append("values(member_seq.NEXTVAL, #{memberId}, #{password}, " +
				"#{email}, #{phone}, #{address})")
		return query.toString()
	}
}


