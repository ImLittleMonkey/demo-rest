package com.yxh.demorest.dao;

import com.yxh.demorest.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {

    List<User> findAll();

    int addUser(User user);

    void delUser(Integer id);

    void updateUser(User user);

    User finduserById(Long id);
}
