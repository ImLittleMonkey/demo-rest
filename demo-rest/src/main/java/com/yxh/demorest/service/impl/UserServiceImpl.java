package com.yxh.demorest.service.impl;

import com.yxh.demorest.dao.UserDao;
import com.yxh.demorest.entity.User;
import com.yxh.demorest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public int addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public void delUser(Integer id) {
         userDao.delUser(id);
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }


    @Override
    public User finduserById(Long id) {
        return userDao.finduserById(id);
    }
}
