package com.teka.kmp_sample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform