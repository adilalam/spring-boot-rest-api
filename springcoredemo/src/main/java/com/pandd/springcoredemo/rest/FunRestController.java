package com.pandd.springcoredemo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/test")
    public String sayHello() {
        return "Welcome to you first spring boot application.";
    }
}
