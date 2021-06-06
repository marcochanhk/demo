package com.marco.example.demo.service;

import com.marco.example.demo.dao.UserDao;
import com.marco.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public Iterable<User> getUser() {
        return userDao.findAll();
    }
}