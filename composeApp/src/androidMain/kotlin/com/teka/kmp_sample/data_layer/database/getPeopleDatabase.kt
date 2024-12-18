package com.teka.kmp_sample.data_layer.database

import android.content.Context
import androidx.room.Room
import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import kotlinx.coroutines.Dispatchers


fun getPeopleDatabase(context: Context): PeopleDatabase {
    val dbFile = context.getDatabasePath("people.db")
    return Room.databaseBuilder<PeopleDatabase>(
        context = context.applicationContext,
        name = dbFile.absolutePath
    )
        .setDriver(BundledSQLiteDriver())
        .setQueryCoroutineContext(Dispatchers.IO)
        .build()
}


//fun getPeopleDatabase(ctx: Context): RoomDatabase.Builder<PeopleDatabase> {
//    val appContext = ctx.applicationContext
//    val dbFile = appContext.getDatabasePath("people_room.db")
//    return Room.databaseBuilder<PeopleDatabase>(
//        context = appContext,
//        name = dbFile.absolutePath
//    )
//}