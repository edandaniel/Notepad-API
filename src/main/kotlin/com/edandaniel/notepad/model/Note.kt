package com.edandaniel.notepad.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
data class Note(
        @Id var id: String?,
        var title: String,
        var description: String
)