package com.teka.kmp_sample

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.teka.kmp_sample.database.getPeopleDatabase

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KmpSample",
    ) {
        val dao = getPeopleDatabase().build().peopleDao()

        App(dao)
    }
}