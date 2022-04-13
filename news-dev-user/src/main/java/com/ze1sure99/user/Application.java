package com.ze1sure99.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.ze1sure99")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

