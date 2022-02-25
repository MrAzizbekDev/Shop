package com.example.shop.controller;

import com.example.shop.dto.UserDto;
import com.example.shop.entity.Users;
import com.example.shop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/signIn")
public class UserController {
     @Autowired
    UserRepository userRepository;
    @GetMapping()
    public String user(Model model){
     model.addAttribute("user",new UserDto());
     return "userOperation";
    }
    @PostMapping("/add")
    public String check(UserDto userDto,Model model){
        model.addAttribute("user",new UserDto());
        Users user = userRepository.getByUserName(userDto.getUserName());
        if (user.getRole().equals("admin")){
            return "redirect:/book";
        }
        return "notFound";
    }

}
