package com.example.SpringKotlinDemo1

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import java.util.*

@Service
class BookServices{

    @Autowired
    lateinit var booksRepo: BooksRepo;

    fun getallbooks():List<Book>{
        return booksRepo.findAll()
    }

    fun findbook(id:String):Book{
        return booksRepo.findById(id).get()
    }

    fun addbook(book:Book){
        booksRepo.insert(book)
    }

    fun updatebook(book:Book):String{
        booksRepo.save(book)
        return "Updated"
    }

    fun deletebook(id:String):String{
      var  book:Book= booksRepo.findById(id).get()
        booksRepo.delete(book)
        return "Deleted"
    }


}