package com.example.bigquerydemo5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BigqueryDemo5Application {

    public static void main(String[] args) {
        Query.test();
        SpringApplication.run(BigqueryDemo5Application.class, args);
    }

}
