package com.edandaniel.notepad.repository

import com.edandaniel.notepad.model.Note
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface NoteRepository: MongoRepository<Note,String>{
    fun findByTitleContainingIgnoreCase(title:String): List<Note>
}