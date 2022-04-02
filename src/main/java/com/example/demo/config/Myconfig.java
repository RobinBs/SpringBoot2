package com.example.demo.config;


import com.example.demo.bean.Pet;
import com.example.demo.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


/**
 * 配置类首先用@Configuration进行声明，在其中的类对象方法上可以用@Bean注解来给容器注册组件
 * 且生成的组件都是单实例的
 * Configuration的目的是告诉SpringBoot，该文件是配置文件，其本身也是一个组件
 */

@Import(User.class)
//@ImportResource("classpath:beans.xml")
@Configuration(proxyBeanMethods = true)
public class Myconfig {
    /**
     *
     * 通过main中4.1和4.2例子可以看出来，无论是否对@Bean起别名，容器中一个组件一旦注册之后
     * 无论在外部创建多少个对象，都是单实例的
     * 但是当@Configuration(proxyBeanMethods = false)为false，则4.2不再保证单实例
     */

    @Bean
    public User user01(){
        User baishuo = new User("baishuo", 25);
        baishuo.setPet(mi());
        return baishuo;
    }
    @Bean
    public User user02(){
        User zhangsan = new User("zhangsan", 18);
        zhangsan.setPet(mi());
        return zhangsan;
    }
    // 在容器中默认是单实例的
    @Bean("tom")
    public Pet mi(){
        return new Pet("mige");
    }
}
