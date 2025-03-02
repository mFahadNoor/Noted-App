package com.example.noted.repository

import androidx.room.Query
import com.example.noted.database.NoteDatabase
import com.example.noted.model.Note

class NoteRepository(private val db: NoteDatabase) {
    suspend fun insertNote(note: Note) = db.getNoteDao().insertNote(note)
    suspend fun updateNote(note: Note) = db.getNoteDao().updateNote(note)
    suspend fun deleteNote(note: Note) = db.getNoteDao().deleteNote(note)

    fun getAllNotes() = db.getNoteDao().getAllNotes()
    fun getSearchNotes(query: String?) = db.getNoteDao().getSearchNotes(query)
}