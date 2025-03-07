package com.kjone.springkotlinjwt.global.member.details.service

import com.kjone.springkotlinjwt.domain.repository.member.MemberJpaRepository
import com.kjone.springkotlinjwt.global.member.details.MemberDetails
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class MemberDetailsService(
    private val memberRepository: MemberJpaRepository
) : UserDetailsService {
    override fun loadUserByUsername(username: String): UserDetails {
        val member = memberRepository.findMemberByCredential(username)
            ?: throw UsernameNotFoundException(username)

        return MemberDetails(member)
    }
}