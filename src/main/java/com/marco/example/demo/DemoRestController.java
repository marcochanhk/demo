package com.marco.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @RequestMapping("/helloWorld")
    public String sayHelloWorld() {
        return "Say Hello World";
    }

    @GetMapping("/hi")
    public String sayHi() {
        return "Say Hi";
    }
}