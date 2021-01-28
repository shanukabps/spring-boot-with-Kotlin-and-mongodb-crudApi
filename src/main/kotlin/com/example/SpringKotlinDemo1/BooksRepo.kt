package com.example.SpringKotlinDemo1

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface BooksRepo:MongoRepository<Book,String>  {

}