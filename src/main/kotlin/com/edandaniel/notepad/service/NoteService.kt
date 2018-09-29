package com.edandaniel.notepad.service

import com.edandaniel.notepad.model.Note
import com.edandaniel.notepad.repository.NoteRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class NoteService{

    @Autowired
    lateinit var noteRepository: NoteRepository

    fun save(note:Note):Note{
        return noteRepository.save(note)
    }

    fun findAll():List<Note>{
        return noteRepository.findAll()
    }

    fun find(id:String):Note{
        return noteRepository.findById(id).get()
    }

    fun erase(id:String){
        noteRepository.deleteById(id)
    }

    fun findByTitle(title:String):List<Note>{
        return noteRepository.findByTitleContainingIgnoreCase(title)
    }
}