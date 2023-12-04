package com.team.aphs.service;

import com.team.aphs.model.User;


public interface UserService {

    User getUserById(Long userId);

    User getUserByUsername(String username);

    boolean authenticateUser(String username, String password);

    boolean registerUser(User user);
}

