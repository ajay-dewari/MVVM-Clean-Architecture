package me.dewari.ajay.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import me.dewari.ajay.data.dao.NoteDao
import me.dewari.ajay.data.entity.Note

@Database(entities = arrayOf(Note::class), version = 1, exportSchema = false)
abstract class  NoteDatabase: RoomDatabase() {

    abstract fun wordDao(): NoteDao
    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: NoteDatabase? = null

        fun getDatabase(context: Context): NoteDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    NoteDatabase::class.java,
                    "word_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}