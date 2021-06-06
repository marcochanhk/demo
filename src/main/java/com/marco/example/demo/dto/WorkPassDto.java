package com.marco.example.demo.dto;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Data
public class WorkPassDto {

    String userName;

    String token;

    public WorkPassDto() {
    }
}