package com.marco.example.demo.dao;

import com.marco.example.demo.entity.User;
import org.springframework.data.repository.CrudRepository;


public interface UserDao extends CrudRepository<User, Integer> {

}