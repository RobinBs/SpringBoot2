package com.example.demo.controller;

import com.example.demo.bean.Car;
import com.example.demo.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class helloController {

    @Autowired
    Car car;
    @Autowired
    Person person;

    @RequestMapping("/car")
    public String carInfo(){
        return car.toString();
    }

    @RequestMapping("/hello")
    public String handle(){
        return "hello bs!";
    }

    @RequestMapping("/person")
    public String personInfo(){
        return person.toString();
    }
}
