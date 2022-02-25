package com.example.shop.repository;

import com.example.shop.dto.UserDto;
import com.example.shop.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

public interface UserRepository extends JpaRepository<Users,Integer> {

    Users getByUserName(@RequestParam String userName);
}
