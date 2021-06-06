package com.marco.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id;

    @Column
    String firstName;

    @Column
    String lastName;

}