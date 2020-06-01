package me.dewari.ajay.data.entity

import androidx.room.Entity

@Entity(tableName = "note_table")
data class Note(val title: String, val description: String, val priority: String)