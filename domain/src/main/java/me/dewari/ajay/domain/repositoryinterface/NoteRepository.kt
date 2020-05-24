package me.dewari.ajay.domain.repositoryinterface

import androidx.lifecycle.LiveData

interface NoteRepository {
    fun insert(note: Note?)
    fun update(note: Note?)
    fun delete(note: Note?)
    fun deleteAllNotes()
    val allNotes: LiveData<List<Any?>?>?
}