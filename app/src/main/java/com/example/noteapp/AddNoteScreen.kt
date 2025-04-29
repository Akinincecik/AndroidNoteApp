package com.example.noteapp

import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.launch

@Composable
fun AddNoteScreen(navController: NavController, noteViewModel: NoteViewModel = androidx.lifecycle.viewmodel.compose.viewModel()) {
    var noteText by remember { mutableStateOf("") }
    var noteTitle by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = noteTitle,
            onValueChange = { noteTitle = it },
            label = { Text("Başlık") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        OutlinedTextField(
            value = noteText,
            onValueChange = { noteText = it },
            label = { Text("Notunuz") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = {
            if (noteTitle.isNotBlank() && noteText.isNotBlank()) {
                noteViewModel.addNote(title = noteTitle, content = noteText)
                navController.popBackStack()
            } else {
                // Toast mesajı gösterilebilir
                Toast.makeText(navController.context, "Başlık ve not içeriği boş olamaz!", Toast.LENGTH_SHORT).show()
            }
        }) {
            Text(text = "Kaydet")
        }
    }
}
