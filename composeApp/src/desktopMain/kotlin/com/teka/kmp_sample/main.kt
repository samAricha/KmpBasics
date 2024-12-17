package com.teka.kmp_sample

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.teka.kmp_sample.database.getPeopleDatabase
import com.teka.kmp_sample.di.initKoin

fun main() {
    initKoin()

    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "KmpSample",
        ) {
            val dbBuilder = getPeopleDatabase()

            App(dbBuilder)
        }
    }
}