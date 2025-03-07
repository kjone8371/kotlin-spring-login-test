package com.kjone.springkotlinjwt.domain.repository.member

import com.kjone.springkotlinjwt.domain.entity.member.Member
import org.springframework.data.jpa.repository.JpaRepository

interface MemberJpaRepository : JpaRepository<Member, Long> {
    fun existsByCredential(credential: String): Boolean
    fun findMemberByCredential(credential: String): Member? // uniq
}