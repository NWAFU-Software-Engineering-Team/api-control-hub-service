package com.team.aphs.service.impl;

import com.team.aphs.Dao.UserDao;
import com.team.aphs.model.User;
import com.team.aphs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public User getUserById(Long userId) {
        return userDao.selectByPrimaryKey(userId);
    }

    @Override
    public User getUserByUsername(String username) {
        return userDao.getUserByUsername(username);
    }

    @Override
    public boolean authenticateUser(String username, String password) {
        User user = userDao.getUserByUsername(username);
        return user != null && user.getPassword().equals(password);
    }

    @Override
    public boolean registerUser(User user) {
        // You may want to add additional logic for user validation, checking for existing usernames, etc.
        userDao.insert(user);
        return true;
    }
}
