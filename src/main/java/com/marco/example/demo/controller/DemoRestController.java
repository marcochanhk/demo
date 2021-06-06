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

    @GetMapping("/allUser")
    public Iterable<User> getAllUser(User user) {
        return userService.getAllUser();
    }

    @GetMapping("/userByCareer")
    public Iterable<User> ByCarees(User user) {
        return userService.getAllUser();
    }

    @PostMapping("/user")
    public User postUser(@RequestBody User user) {
        userService.addNewUser(user);
        User rs = userService.getUserByName(user.getFirstName(), user.getLastName());
        return rs;
    }

    @PatchMapping("/user")
    public String patchUser(User user) {
        return "Patch user";
    }

}