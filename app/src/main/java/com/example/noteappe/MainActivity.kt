package com.example.noteappe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.noteappe.deta.NoteDataSours
import com.example.noteappe.model.Note
import com.example.noteappe.screens.NoteScreen
import com.example.noteappe.ui.theme.NoteAppeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NoteAppeTheme {
               Surface {
                   val notes = remember {
                       mutableStateListOf<Note>()
                   }
                   NoteScreen(
                       notes = notes,
                       onRemoveNote = {
                                      notes.remove(it)
                       },
                       onAddNote = {
                           notes.add(it)
                       }

                   )



               }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NoteAppeTheme {
    }
}