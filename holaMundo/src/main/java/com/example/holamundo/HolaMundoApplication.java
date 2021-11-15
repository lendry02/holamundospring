package com.example.holamundo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HolaMundoApplication {

    public static void main(String[] args) {
        SpringApplication.run(HolaMundoApplication.class, args);
    }

    @RequestMapping("/")
    public String index() {
        return "Hello World！";
    }
}
