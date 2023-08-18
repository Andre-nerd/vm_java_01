package com.boukreev.template_spring_boot.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SimpleController {

    @Value("${hello}")
    private String hello;

    @GetMapping("/")
    public String helloPage() {
        System.out.println("Hello page working");
        return "hello";
    }
}
