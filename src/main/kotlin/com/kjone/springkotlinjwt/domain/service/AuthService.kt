package com.kjone.springkotlinjwt.domain.service

import com.kjone.springkotlinjwt.domain.dto.auth.dto.TokenDto

interface AuthService {
    fun authenticate(credential: String, password: String): TokenDto
    fun createNewMember(name: String, credential: String, password: String): Long
    fun getNewToken(refreshToken: String): TokenDto
}