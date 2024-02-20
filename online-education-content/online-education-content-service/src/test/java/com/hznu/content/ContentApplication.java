package com.hznu.content;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ContentApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ContentApplication.class, args);

//        输出容器中所有bean
//        System.out.println("======================================================");
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//        System.out.println("======================================================");
    }
}
