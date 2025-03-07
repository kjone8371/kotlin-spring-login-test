package com.kjone.springkotlinjwt.global.response

sealed interface BaseResponse {
    val code: String
    val status: Int
}