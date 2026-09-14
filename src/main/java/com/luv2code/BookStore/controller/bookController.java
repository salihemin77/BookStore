package com.luv2code.BookStore.controller;

import com.luv2code.BookStore.service.BookService;
import org.springframework.web.bind.annotation.*;
import com.luv2code.BookStore.entity.Book;


import java.util.List;
@RestController
@RequestMapping("/api")
public class bookController {
    BookService bookService;
    public bookController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping("/books")
    public List<Book> getBooks(){
        return bookService.findAll();
    }

    @GetMapping("/books/{bookId}")
    public Book getBook(@PathVariable("bookId") int bookId) {
        return bookService.findById(bookId);
    }
    @PostMapping("/books")
    public Book addBook(@RequestBody Book book) {
        return bookService.save(book);
    }
    @DeleteMapping("/books/{bookId}")
    public void deleteBook(@PathVariable("bookId") int bookId) {
        bookService.delete(bookId);

    }
    @GetMapping("/books/search")
    public List<Book> searchByTitle(@RequestParam("title") String title) {
        return bookService.searchByTitle(title);

    }






}
