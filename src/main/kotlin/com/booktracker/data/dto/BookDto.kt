package com.booktracker.data.dto

import com.booktracker.data.entity.Book
import lombok.Getter
import lombok.Setter

@Getter
@Setter
data class BookDto(
    private val id: Long,

    private val title: String,

    private val author: String,

    private val dateAdded: String
) {

}
