package com.marco.example.demo.entity;

import javax.persistence.*;

@Entity
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    @Column
    String firstName;

    @Column
    Integer lastName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getLastName() {
        return lastName;
    }

    public void setLastName(Integer lastName) {
        this.lastName = lastName;
    }
}