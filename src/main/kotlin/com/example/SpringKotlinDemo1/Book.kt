package com.example.SpringKotlinDemo1

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document
import java.lang.annotation.Documented


@Document(collection = "book")
data class Book(
    @Id
    val id:String="",
    val name:String="")