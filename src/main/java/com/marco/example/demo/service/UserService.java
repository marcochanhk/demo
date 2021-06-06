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

    public Iterable<User> getUserByCareer(String career) {
        return userDao.findByCareer(career);
    }

    public Optional<User> getUserById(Integer id) {
        return userDao.findById(id);
    }

    public void addNewUser(User user) {
        userDao.save(user);
    }

    public User getUserByName(String firstName,String lastName) {
        return userDao.findByFirstNameAndLastName(firstName, lastName);
    }
}