package com.ppcola.easypan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class EasypanApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasypanApplication.class, args);
    }

}
