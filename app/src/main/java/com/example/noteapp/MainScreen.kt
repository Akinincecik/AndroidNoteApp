package com.example.noteapp

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.noteapp.ui.theme.NoteAppTheme

@Composable
fun MainScreen(navController: NavController, noteViewModel: NoteViewModel = androidx.lifecycle.viewmodel.compose.viewModel()) {
    // ViewModel'den notları alıyoruz
    val notes = noteViewModel.allNotes.collectAsState(initial = emptyList())

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Not Defteri Ana Ekranı")

        Spacer(modifier = Modifier.height(16.dp))

        // Kaydetme butonu
        Button(onClick = {
            navController.navigate("add_note")
        }) {
            Text(text = "Yeni Not Ekle")
        }

        Spacer(modifier = Modifier.height(16.dp))

        // Notları listeleme
        LazyColumn(modifier = Modifier.fillMaxSize()) {
            items(notes.value) { note ->
                NoteItem(note)
            }
        }
    }
}

@Composable
fun NoteItem(note: Note, noteViewModel: NoteViewModel = androidx.lifecycle.viewmodel.compose.viewModel()) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Text(text = "Başlık: ${note.title}")
        Text(text = "İçerik: ${note.content}")

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = { noteViewModel.deleteNote(note) }
        ) {
            Text(text = "Sil")
        }
    }
}
