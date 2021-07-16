package com.t1908e.springbootwshost.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Student {
    @Id
    private String rollNumber;
    private String email;
    private String name;
    private String phone;
    private int status;
}
