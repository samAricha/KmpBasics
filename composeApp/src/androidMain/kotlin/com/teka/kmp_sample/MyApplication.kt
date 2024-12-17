package com.teka.kmp_sample

import android.app.Application
import com.teka.kmp_sample.di.initKoin
import org.koin.android.ext.koin.androidContext

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin {
            androidContext(this@MyApplication)
        }
    }
}