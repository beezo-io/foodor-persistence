package com.beezo.foodor.persistence.entity;

import lombok.Data;

@Data
public class User {

    private String username;
    private String email;
    private String password;
    private String firstname;
    private String lastname;

}
