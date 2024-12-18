package com.teka.kmp_sample.di

import com.teka.kmp_sample.data_layer.datasource.NoteLocalDataSource
import com.teka.kmp_sample.data_layer.datasource.NoteLocalDataSourceImpl
import com.teka.kmp_sample.data_layer.repository.NoteRepository
import com.teka.kmp_sample.data_layer.repository.NoteRepositoryImpl
import com.teka.kmp_sample.dependencies.MyRepository
import com.teka.kmp_sample.dependencies.MyRepositoryImpl
import com.teka.kmp_sample.dependencies.MyViewModel
import org.koin.compose.viewmodel.dsl.viewModelOf
import org.koin.core.module.Module
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module

expect val platformModule: Module

val sharedModule = module {
    singleOf(::MyRepositoryImpl).bind<MyRepository>()
    viewModelOf(::MyViewModel)
}

val provideDataSourceModule = module {
    singleOf(::NoteLocalDataSourceImpl).bind(NoteLocalDataSource::class)
}

val provideRepositoryModule = module {
    singleOf(::NoteRepositoryImpl).bind(NoteRepository::class)
}

val provideViewModelModule = module {
    viewModelOf(::MyViewModel)
}