package com.teka.kmp_sample.data_layer.datasource

import com.teka.kmp_sample.data_layer.database.PeopleDatabase
import com.teka.kmp_sample.data_layer.entities.NoteEntity


class NoteLocalDataSourceImpl(private val appDatabase: PeopleDatabase) : NoteLocalDataSource {
    override suspend fun getAllNotes(): List<NoteEntity> = appDatabase.noteDao().getAllNotes()

    override suspend fun createNote(note: NoteEntity) = appDatabase.noteDao().createNote(note)

    override suspend fun deleteNote(id: Long) = appDatabase.noteDao().deleteNoteById(id)

    override suspend fun updateNote(note: NoteEntity) = appDatabase.noteDao().updateNote(note)

    override suspend fun getNote(id: Long) = appDatabase.noteDao().getNoteById(id)
}