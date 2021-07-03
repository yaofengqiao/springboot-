package com.hue;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.hue.mapper")
public class FistBuilderApplication {
    public static void main(String[] args) {
        SpringApplication.run(FistBuilderApplication.class,args);
    }
}
