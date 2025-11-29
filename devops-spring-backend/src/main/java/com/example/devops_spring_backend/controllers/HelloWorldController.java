package com.example.devops_spring_backend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String HelloWorld(){
        return "Hello worldsss!";
    }

    @GetMapping("/health")
    public String HealthCheck(){
        return "Health check";
    }

    @GetMapping("/post")
    public String PostMethod(){
        return "PostMethod!";
    }
}
