package com.kjone.springkotlinjwt.domain.controller.member

import com.kjone.springkotlinjwt.domain.dto.member.response.MemberInfoResponseDto
import com.kjone.springkotlinjwt.domain.service.MemberService
import com.kjone.springkotlinjwt.global.response.ResponseData
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/member")
class MemberController(
    private val memberService: MemberService
) {
    @GetMapping("/me")
    fun me(): ResponseEntity<ResponseData<MemberInfoResponseDto>> {
        val me = memberService.me()

        return ResponseData.ok(data = MemberInfoResponseDto(me.name))
    }
}