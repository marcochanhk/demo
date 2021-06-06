package com.marco.example.demo.controller;

import com.marco.example.demo.dao.UserDao;
import com.marco.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoRestController {

    @Autowired
    UserService userService;

    @RequestMapping("/helloWorld")
    public String sayHelloWorld() {
        return "Say Hello World";
    }

    @GetMapping("/user")
    public UserDao getUser(UserDao user) {
        return (UserDao) userService.getUser();
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