package com.dummy.wordbook.member.mapper
/*
import com.dummy.wordbook.user.dto.MemberDto
import com.dummy.wordbook.sql.MemberSQL
import org.apache.ibatis.annotations.InsertProvider
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.SelectProvider
import org.apache.ibatis.annotations.UpdateProvider

@Mapper
interface MemberMapper {
    @SelectProvider(type = MemberSQL::class, method = "selectMemberById")
    fun selectMemberById(id: Int): MemberDto

    @SelectProvider(type = MemberSQL::class, method = "selectMemberByMemberId")
    fun selectMemberByMemberId(memberId: String): MemberDto

    @UpdateProvider(type = MemberSQL::class, method = "updateMemberPassword")
    fun updateMemberPassword(id: Int, password: String)

    @UpdateProvider(type = MemberSQL::class, method = "updateMemberEmail")
    fun updateMemberEmail(id: Int, email: String)

    @UpdateProvider(type = MemberSQL::class, method = "updateMemberPhone")
    fun updateMemberPhone(id: Int, phone: String)

    @UpdateProvider(type = MemberSQL::class, method = "updateMemberAddress")
    fun updateMemberAddress(id: Int, address: String?)

    @UpdateProvider(type = MemberSQL::class, method = "updateMemberCertified")
    fun updateMemberCertified(id: Int, certified: Int)

    @InsertProvider(type = MemberSQL::class, method = "insertMember")
    fun insertMember(memberDto: MemberDto)
}*/
interface MemberMapper {

}
