package com.example.demo.controller;

import com.example.demo.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class helloController {

    @Autowired
    Car car;

    @RequestMapping("/car")
    public String carInfo(){
        return car.toString();
    }

    @RequestMapping("/hello")
    public String handle(){
        return "hello bs!";
    }
}
