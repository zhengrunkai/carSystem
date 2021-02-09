package com.mymendian.mymendian.service;

import com.mymendian.mymendian.model.User;

import java.util.List;

public interface UserService {
    User findbyId(String id);

    List<User> findAll();

    User save(User ayUser);

    void delete(String id);

    boolean verifyLogin(User user);

    boolean verifyEmail(User user);


    User findbyName(String username);
}