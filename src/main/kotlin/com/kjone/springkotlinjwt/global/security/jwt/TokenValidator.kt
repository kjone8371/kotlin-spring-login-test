package com.kjone.springkotlinjwt.global.security.jwt

import org.springframework.security.core.Authentication

interface TokenValidator {
    fun validate(jwt: String): Authentication
}