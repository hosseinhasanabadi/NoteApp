package com.example.noteappe.screens

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.noteappe.deta.NoteDataSours
import com.example.noteappe.model.Note


class NoteViewModel :ViewModel() {
    private var noteList =
        mutableStateListOf<Note>()
     init {
         noteList.addAll(
             NoteDataSours().loadNote()
             )

     }

    fun addNote(note: Note){
        noteList.add(note)
    }
    fun removeNote(note: Note){
        noteList.remove(note)
    }

    fun getAllNotes():List<Note>{
        return noteList
    }

}