package com.example.noteapp

import android.content.Context
import androidx.room.Room

object DatabaseProvider {
    private var database: NoteDatabase? = null

    fun getDatabase(context: Context): NoteDatabase {
        if (database == null) {
            database = Room.databaseBuilder(
                context.applicationContext,
                NoteDatabase::class.java,
                "note_database"
            ).build()
        }
        return database!!
    }
}
