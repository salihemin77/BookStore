package com.luv2code.BookStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.BookStore.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
