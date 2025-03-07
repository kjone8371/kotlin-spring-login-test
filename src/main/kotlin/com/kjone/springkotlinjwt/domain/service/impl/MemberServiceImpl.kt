package com.kjone.springkotlinjwt.domain.service.impl

import com.kjone.springkotlinjwt.domain.dto.member.dto.MemberDto
import com.kjone.springkotlinjwt.domain.service.MemberService
import com.kjone.springkotlinjwt.global.member.MemberHolder
import org.springframework.stereotype.Service

@Service
class MemberServiceImpl(
    private val memberHolder: MemberHolder
) : MemberService {
    override fun me(): MemberDto {
        val member = memberHolder.get()
        return MemberDto(member.name)
    }
}