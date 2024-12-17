package com.teka.kmp_sample.di

import com.teka.kmp_sample.dependencies.DbClient
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

actual val platformModule = module {
    singleOf(::DbClient)
}