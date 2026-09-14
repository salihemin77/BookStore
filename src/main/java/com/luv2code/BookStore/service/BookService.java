package com.luv2code.BookStore.service;

import com.luv2code.BookStore.entity.Book;
import java.util.List;

public interface BookService {
    Book save(Book book);
    void update(Book book);
    void delete(int id);
    Book findById(int id);
   List<Book> findAll();
   List<Book> searchByTitle(String title);

}
