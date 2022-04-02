package com.example.demo;

import com.example.demo.bean.Pet;
import com.example.demo.bean.User;
import com.example.demo.config.Myconfig;
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
        // 3. 查看配置类本身情况
        Myconfig bean = run.getBean(Myconfig.class);
        System.out.println("Myconfig对象: " + bean);
        // 4. 从容器中获取组件(@Bean中起了具体名称)
        // 4.1. 从容器中获取Pet组件(@Bean中起了具体名称)
        Pet tom1 = run.getBean("tom", Pet.class);
        Pet tom2 = run.getBean("tom", Pet.class);
//        Pet tom3 = bean.mi();
//        Pet tom4 = bean.mi();
        System.out.println("组件是否相等:" + (tom1 == tom2));
        // 通过bean方法直接获取，@bean注解起的别名就没有意义了
//        System.out.println("组件是否相等:" + (tom3 == tom4));
        // 4.2. 从容器中获取User组件(@Bean中无具体名称)
        User user1 = bean.user01();
        User user2 = bean.user01();
        System.out.println("组件是否相等:" + (user1 == user2));
        // 4.3. 配置文件向容器中添加组件的测试，本质是对proxyBeanMethods的测试
        User user3 = bean.user01();
        Pet tom5 = run.getBean("tom", Pet.class);
        System.out.println("人养猫的验证:" + (user3.getPet() == tom5));
        // 5. 测试@import注解
        String[] userNames = run.getBeanNamesForType(User.class);
        for(String userName : userNames){
            System.out.println(userName);
        }
        // 6. 测试@importResource注解
//        boolean hasPerson = run.containsBean("person");
//        boolean hasCat = run.containsBean("cat");
//        System.out.println("拥有person和cat这两个组件:" + hasPerson + " " + hasCat);
    }

}
