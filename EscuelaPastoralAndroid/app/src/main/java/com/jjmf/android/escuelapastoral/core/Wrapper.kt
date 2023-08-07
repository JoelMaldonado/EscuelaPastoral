package com.jjmf.android.escuelapastoral.core

data class Wrapper<T>(
    val isSuccess: Boolean,
    val message: String,
    val status: Int,
    val data: T
)