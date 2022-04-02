package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class helloController {

    @RequestMapping("/hello")
    public String handle(){
        return "hello bs!";
    }
}
