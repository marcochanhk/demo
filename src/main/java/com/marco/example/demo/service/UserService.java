package com.marco.example.demo.service;

import com.marco.example.demo.dao.UserDao;
import com.marco.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public Iterable<User> getAllUser() {
        return userDao.findAll();
    }

    public Optional<User> getUserDao(Integer id) {
        return userDao.findById(id);
    }

    public void addNewUser(String firstName,String lastName) {
        User n = new User();
        n.setFirstName(firstName);
        n.setFirstName(lastName);
        userDao.save(n);
    }
}