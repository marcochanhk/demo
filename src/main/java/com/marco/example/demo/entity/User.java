package com.marco.example.demo.entity;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Data
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @NonNull
    @Column
    String firstName;

    @NonNull
    @Column
    String lastName;

    @Column
    String career;

    protected User() {}

    public User(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}