package com.teka.kmp_sample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.teka.kmp_sample.database.getPeopleDatabase

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val dbBuilder = getPeopleDatabase(applicationContext)
        setContent {
            App(dbBuilder)
        }
    }
}
