package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/spring")
public class HelloController {

    @GetMapping("/nawaz")
    public String hello(Model model) {
        model.addAttribute("message", "Hello!");
        String jsp = "index";
        return jsp;
    }

    @GetMapping("/helloworld")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World!");
        return "index";
    }
}
