package com.hznu.content;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Arrays;

@EnableSwagger2Doc
@SpringBootApplication
@ComponentScan(basePackages = "com.hznu")
public class ContentApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ContentApplication.class, args);

//        输出容器中所有bean
//        System.out.println("======================================================");
//        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
//        System.out.println("======================================================");
    }
}
