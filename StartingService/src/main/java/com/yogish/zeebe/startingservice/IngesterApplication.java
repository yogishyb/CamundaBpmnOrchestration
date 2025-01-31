package com.yogish.zeebe.startingservice;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {
        "com.yogish"

})
public class IngesterApplication {
    public static void main(String[] args) {
        SpringApplication.run(IngesterApplication.class, args);
    }
}