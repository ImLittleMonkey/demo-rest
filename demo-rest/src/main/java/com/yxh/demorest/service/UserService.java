package com.yxh.demorest.service;

import com.yxh.demorest.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();

    int addUser(User user);

    void delUser(Integer id);

    void updateUser(User user);

    User finduserById(Long id);
}
