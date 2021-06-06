package com.marco.example.demo.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class DemoRestController {

    @RequestMapping("/helloWorld")
    public String sayHelloWorld() {
        return "Say Hello World";
    }

    @GetMapping("/user")
    public String getUser() {
        return "Get user";
    }

    @PostMapping("/user")
    public String postUser() {
        return "Post user";
    }

    @PatchMapping("/user")
    public String patchUser() {
        return "Patch user";
    }

}