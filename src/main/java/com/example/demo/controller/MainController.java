package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
public class MainController {


    @GetMapping("/")
    public String main() {
        return "main";
    }

    @GetMapping("/login")
    public String login(HttpServletRequest request) {

        if (request.getParameterMap().containsKey("error")){
            System.out.println("ssssssssssss");
        }

        return "login";
    }


}
