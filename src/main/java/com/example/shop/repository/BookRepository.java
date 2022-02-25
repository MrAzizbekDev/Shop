package com.example.shop.repository;

import com.example.shop.entity.Book;
import com.example.shop.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface BookRepository extends JpaRepository<Book,Integer> {

   // Users getByUserName(@RequestParam String userName);
}
