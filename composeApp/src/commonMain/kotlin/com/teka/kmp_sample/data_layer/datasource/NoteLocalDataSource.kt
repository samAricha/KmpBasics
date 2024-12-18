package com.teka.kmp_sample.data_layer.datasource

import com.teka.kmp_sample.data_layer.entities.NoteEntity

interface NoteLocalDataSource {
    suspend fun getAllNotes(): List<NoteEntity>
    suspend fun createNote(note: NoteEntity)
    suspend fun deleteNote(id: Long)
    suspend fun updateNote(note: NoteEntity)
    suspend fun getNote(id: Long): NoteEntity?
}