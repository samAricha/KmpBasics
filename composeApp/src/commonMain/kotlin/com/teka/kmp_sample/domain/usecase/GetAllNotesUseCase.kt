package com.teka.kmp_sample.domain.usecase

import com.teka.kmp_sample.data_layer.repository.NoteRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class GetAllNotesUseCase : KoinComponent {
    private val noteRepository: NoteRepository by inject()
    suspend fun execute() = noteRepository.getAllNotes()
}