package com.kjone.springkotlinjwt.domain.dto.auth.response

data class TokenResponseDto(
    val accessToken: String,
    val refreshToken: String
)