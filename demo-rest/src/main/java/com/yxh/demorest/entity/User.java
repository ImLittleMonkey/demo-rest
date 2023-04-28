package com.yxh.demorest.entity;

import lombok.Data;

@Data
public class User {
    private  Long id;
    private String username;
    private String password;
    private  String email;

    public User() {
    }

    public User(Long id, String username, String password, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
    }
}
