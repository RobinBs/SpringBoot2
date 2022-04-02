package com.example.demo;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @RequestMapping("/bbb")
    public String test(){
        return "测试包扫描";
    }
}
