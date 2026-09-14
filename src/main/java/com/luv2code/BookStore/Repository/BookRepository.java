package com.luv2code.BookStore.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.BookStore.entity.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book,Integer> {
List<Book> findByTitleContainingIgnoreCase(String title);

}
