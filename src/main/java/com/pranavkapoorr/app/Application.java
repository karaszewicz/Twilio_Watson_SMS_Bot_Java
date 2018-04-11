package com.pranavkapoorr.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.pranavkapoorr.controller")
public class Application {

    public static void main(String[] args) {
    	System.setProperty("server.port", "5000");
        SpringApplication.run(Application.class, args);
    }
}