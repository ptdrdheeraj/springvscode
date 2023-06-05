package com.api.book.bootapibook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.book.bootapibook.Services.BookService;
import com.api.book.bootapibook.model.Book;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

@GetMapping("/books")
 public List<Book> bookhandle(){

        return this.bookService.getAllBook();
    }

    @GetMapping("/books/{id}")
    public Book getBookbyid(@PathVariable("id") int id){

        return this.bookService.getBookbyId(id);

    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book book){

        Book b = this.bookService.addBook(book);
        return b;
    }

    @DeleteMapping("/books/{bookId}")
    public void deleteBook(@PathVariable("bookId") int bookId){

        this.bookService.deleteBook(bookId);
    }

    @PutMapping("/books/{bookid}")
    public Book updateBook(@RequestBody Book book,@PathVariable("bookid") int bookid){

        this.bookService.updateBook(book,bookid);
        return  book;
    } 
}
