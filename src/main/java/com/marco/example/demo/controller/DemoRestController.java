package com.marco.example.demo.controller;

import com.marco.example.demo.dao.UserDao;
import com.marco.example.demo.entity.User;
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
    public Iterable<User> getUser(User user) {
        return userService.getAllUser();
    }

    @PostMapping("/user")
    public String postUser(@RequestBody User user) {
        System.out.println("Post user");
        userService.addNewUser(user.getFirstName(), user.getLastName());
        return "Post user";
    }

    @PatchMapping("/user")
    public String patchUser(User user) {
        return "Patch user";
    }

}