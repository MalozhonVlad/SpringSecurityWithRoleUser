package com.example.demo.controller;

import com.example.demo.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class MainController {

//    private final UserRepository userRepository;

    @GetMapping("/")
    public String main() {
        return "main";
    }


}
