package com.teka.kmp_sample.data_layer.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.teka.kmp_sample.data_layer.entities.NoteEntity
import com.teka.kmp_sample.data_layer.entities.PersonEntity

@Database(
    entities = [PersonEntity::class, NoteEntity::class],
    version = 1,
    exportSchema = false
)
abstract class PeopleDatabase: RoomDatabase() {

    abstract fun peopleDao(): PeopleDao
    abstract fun noteDao(): NoteDao

}