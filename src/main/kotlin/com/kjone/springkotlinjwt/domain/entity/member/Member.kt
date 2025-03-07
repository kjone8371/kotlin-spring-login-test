package com.kjone.springkotlinjwt.domain.entity.member

import com.kjone.springkotlinjwt.global.common.entity.BaseTimeEntity
import com.kjone.springkotlinjwt.global.common.id.WrappedLong
import jakarta.persistence.*

@Entity(name = "tb_member")
data class Member(
    @Column(unique = true, nullable = false)
    val credential: String,

    @Column(nullable = false)
    val password: String, // bcrypt

    @Column(nullable = false)
    val name: String,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: WrappedLong = WrappedLong.NULL
) : BaseTimeEntity()