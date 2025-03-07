package com.kjone.springkotlinjwt.domain.dto.auth.dto

data class TokenDto(
    val accessToken: String,
    val refreshToken: String
)
