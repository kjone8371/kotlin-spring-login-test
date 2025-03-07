package com.kjone.springkotlinjwt.domain.dto.auth.request

import com.fasterxml.jackson.annotation.JsonCreator

data class NewTokenRequestDto @JsonCreator constructor(
    val refreshToken: String
)