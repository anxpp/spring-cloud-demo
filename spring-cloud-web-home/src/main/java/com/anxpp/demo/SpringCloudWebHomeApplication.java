package com.anxpp.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudWebHomeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudWebHomeApplication.class, args);
    }

    @RequestMapping
    public String index() {
        return "Hello word !";
    }
}
