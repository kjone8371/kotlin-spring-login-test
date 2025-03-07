package com.kjone.springkotlinjwt.domain.entity.member

import com.kjone.springkotlinjwt.domain.repository.member.MemberJpaRepository
import kotlin.jvm.optionals.getOrNull

@JvmInline
value class MemberId(val id: Long) {
    fun fetch(repository: MemberJpaRepository) = repository.findById(id).getOrNull()
}