package com.example.SpringKotlinDemo1

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.annotation.Id
import org.springframework.web.bind.annotation.*

@RestController
class BookContoller {
    @Autowired
    lateinit var bookServcice:BookServices

    @GetMapping("/")
    fun getbookslist():List<Book>
    {
        return bookServcice.getallbooks()
    }

    @PostMapping("/")
    fun addbook(@RequestBody book:Book):String
    {
       bookServcice.addbook(book)
        return "Saved"
    }

    @RequestMapping(value = ["/{id}"], method = [RequestMethod.GET])
    fun findbook(@PathVariable id:String):Book{

        return bookServcice.findbook(id)
    }

    @RequestMapping(value = ["/update"], method = [RequestMethod.PUT])
    fun updatebook(@RequestBody book:Book):String{
        bookServcice.updatebook(book)
        return "Updated"
    }

    @RequestMapping(value = ["/delete/{id}"], method = [RequestMethod.DELETE])
    fun deletebook(@PathVariable id:String):String{
        bookServcice.deletebook(id)
        return "DELETED"
    }

}