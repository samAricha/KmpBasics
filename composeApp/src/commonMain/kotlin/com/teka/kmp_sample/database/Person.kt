package com.teka.kmp_sample.database

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Person(
    val name: String,
    @PrimaryKey(autoGenerate = true) val id: Int = 0
)
