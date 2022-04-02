package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        // 1. 获取IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
        // 2. 打印初始化的各类对象名称
        String[] names = run.getBeanDefinitionNames();
        for (String beanName : names) {
            System.out.println(beanName);
        }
        System.out.println("测试git");
    }

}
