package com.marco.example.demo.dao;

import com.marco.example.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserDao extends JpaRepository<User, Integer> {

    List<User> findByCareer(String career);

    User findByFirstNameAndLastName(String firstName, String lastName);

}