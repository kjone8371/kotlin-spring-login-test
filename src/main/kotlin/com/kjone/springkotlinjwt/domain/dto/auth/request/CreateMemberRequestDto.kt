package com.kjone.springkotlinjwt.domain.dto.auth.request

import jakarta.validation.constraints.NotBlank

data class CreateMemberRequestDto(
    @field:NotBlank
    val credential: String,

    @field:NotBlank
    val password: String,

    @field:NotBlank
    val name: String
)