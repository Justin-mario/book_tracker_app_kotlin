package com.booktracker.data.entity

import com.booktracker.data.dto.BookDto
import lombok.Getter
import lombok.Setter
import java.time.LocalDate
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
@Setter
@Getter
data class Book(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private val id: Long,

    private val title: String,

    private val author: String,

    private val dateAdded: LocalDate = LocalDate.now(),

    ) {

}
