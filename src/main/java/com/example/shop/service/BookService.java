package com.example.shop.service;

import com.example.shop.entity.Book;
import com.example.shop.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    @Autowired
    BookRepository bookRepository;
    public void add(Book book) {
        Book book1 = new Book();
        book1.setName(book.getName());
        book1.setGenre(book.getGenre());
        bookRepository.save(book1);
    }
}
