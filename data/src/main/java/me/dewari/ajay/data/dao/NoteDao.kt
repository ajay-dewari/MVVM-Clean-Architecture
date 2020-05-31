package me.dewari.ajay.data.dao

import androidx.room.*
import me.dewari.ajay.data.entity.Note

@Dao
interface NoteDao {

    @Insert
    fun insert(note: Note)

    @Update
    fun update(note: Note)

    @Delete
    fun delete(note: Note)

    @Query("DELETE FROM note_table")
    fun deleteAllNotes()

    @Query("SELECT *FROM note_table ORDER BY priority DESC")
    fun getAllNotes(): List<Note>?
}