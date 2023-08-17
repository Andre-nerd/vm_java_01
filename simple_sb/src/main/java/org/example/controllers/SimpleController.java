package org.example.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.apache.log4j.Logger;

@Controller
public class SimpleController {

    private Logger logger = Logger.getLogger(SimpleController.class);

    /** required = false - если параметры не переданы, то заполнит null, если true  - То 400 Bad Request */
    @GetMapping("/hello")
    public String helloPage(
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "surname", required = false) String surname
    ) {
        System.out.println("hello " + name + " " + surname);
        return "first/hello";
    }
}
