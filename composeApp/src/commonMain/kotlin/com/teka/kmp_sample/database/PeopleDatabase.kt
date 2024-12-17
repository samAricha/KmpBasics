package com.teka.kmp_sample.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.teka.kmp_sample.database.PeopleDao
import com.teka.kmp_sample.database.Person

@Database(
    entities = [Person::class],
    version = 1,
    exportSchema = false
)
abstract class PeopleDatabase: RoomDatabase() {

    abstract fun peopleDao(): PeopleDao

}