package com.teka.kmp_sample.database;

import androidx.room.Room
import androidx.room.RoomDatabase
import java.io.File

fun getPeopleDatabase(): RoomDatabase.Builder<PeopleDatabase> {
    val dbFile = File(System.getProperty("java.io.tmpdir"), "people_room.db")
    return Room.databaseBuilder<PeopleDatabase>(
        name = dbFile.absolutePath,
    )
}