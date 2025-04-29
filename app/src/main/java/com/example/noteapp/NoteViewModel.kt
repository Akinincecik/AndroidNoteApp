package com.example.noteapp

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class NoteViewModel(application: Application) : AndroidViewModel(application) {

    private val noteDao = DatabaseProvider.getDatabase(application).noteDao()

    // Notları tutan MutableStateFlow
    private val _allNotes = MutableStateFlow<List<Note>>(emptyList())
    val allNotes: StateFlow<List<Note>> = _allNotes

    init {
        // Notları başlatma işlemi
        viewModelScope.launch {
            _allNotes.value = noteDao.getAllNotes()  // Veritabanından tüm notları alıyoruz
        }
    }

    // Not ekleme fonksiyonu
    fun addNote(title: String, content: String) {
        val note = Note(title = title, content = content)
        viewModelScope.launch {
            noteDao.insert(note)
            // Yeni notu ekliyoruz, listeyi yeniden almak yerine sadece ekliyoruz
            _allNotes.value = _allNotes.value + note
        }
    }

    fun deleteNote(note: Note) {
        viewModelScope.launch {
            noteDao.delete(note)
            // Notu listeden çıkar
            _allNotes.value = _allNotes.value - note
        }
    }

}

//noteDao.getAllNotes()