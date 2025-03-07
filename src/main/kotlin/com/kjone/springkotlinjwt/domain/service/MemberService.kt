package com.kjone.springkotlinjwt.domain.service

import com.kjone.springkotlinjwt.domain.dto.member.dto.MemberDto

interface MemberService {
    fun me(): MemberDto
}