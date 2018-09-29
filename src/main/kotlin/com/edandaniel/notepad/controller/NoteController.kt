package com.edandaniel.notepad.controller

import com.edandaniel.notepad.model.Note
import com.edandaniel.notepad.service.NoteService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/note")
class NoteController{

    @Autowired
    lateinit var noteService: NoteService

    @GetMapping("/check")
    fun checkHealth(): String {
        return "OK"
    }

    @GetMapping
    fun getAll(): List<Note> {
        return noteService.findAll()
    }

    @PostMapping
    fun save(@RequestBody note:Note): Note {
        return noteService.save(note)
    }

    @GetMapping("/{id}")
    fun find(@PathVariable ("id") id:String): Note{
        return noteService.find(id)
    }

    @DeleteMapping("/{id}")
    fun erase(@PathVariable ("id") id:String){
        noteService.erase(id)
    }

    @GetMapping("/title/{title}")
    fun findByTitle(@PathVariable ("title") title:String): List<Note>{
        return noteService.findByTitle(title)
    }
}