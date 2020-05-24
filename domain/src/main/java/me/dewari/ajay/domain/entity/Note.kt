package me.dewari.ajay.domain.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_table")
data class Note(
    @field:ColumnInfo(name = "title_column") val title: String,
    val description: String,
    val priority: Int
) {
    @PrimaryKey(autoGenerate = true)
    var id = 0

}