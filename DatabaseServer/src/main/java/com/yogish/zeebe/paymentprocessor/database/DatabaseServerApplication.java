package com.yogish.zeebe.paymentprocessor.database;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DatabaseServerApplication.class,args);
    }
}