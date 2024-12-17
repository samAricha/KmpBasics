package com.teka.kmp_sample.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase


//fun getPeopleDatabase(context: Context): PeopleDatabase {
//    val dbFile = context.getDatabasePath("people.db")
//    return Room.databaseBuilder<PeopleDatabase>(
//        context = context.applicationContext,
//        name = dbFile.absolutePath
//    )
//        .setDriver(BundledSQLiteDriver())
//        .build()
//}


fun getPeopleDatabase(ctx: Context): RoomDatabase.Builder<PeopleDatabase> {
    val appContext = ctx.applicationContext
    val dbFile = appContext.getDatabasePath("people_room.db")
    return Room.databaseBuilder<PeopleDatabase>(
        context = appContext,
        name = dbFile.absolutePath
    )
}