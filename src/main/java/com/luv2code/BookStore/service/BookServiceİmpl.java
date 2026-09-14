package com.luv2code.BookStore.service;

import com.luv2code.BookStore.Repository.BookRepository;
import com.luv2code.BookStore.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceİmpl implements BookService {

    private BookRepository bookRepository;

    public BookServiceİmpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book save(Book book) {
        bookRepository.save(book);
        return book;
    }

    @Override
    public void update(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void delete(int id) {
        bookRepository.deleteById(id);
    }

    @Override
    public Book findById(int id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}