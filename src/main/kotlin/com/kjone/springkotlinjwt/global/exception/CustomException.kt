package com.kjone.springkotlinjwt.global.exception

class CustomException(val detail: ExceptionDetail, vararg val formats: Any?) : RuntimeException()
