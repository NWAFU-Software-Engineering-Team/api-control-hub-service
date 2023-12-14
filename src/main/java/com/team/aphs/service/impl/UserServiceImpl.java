package com.team.aphs.service.impl;

import com.team.aphs.Dao.UserDao;
import com.team.aphs.model.User;
import com.team.aphs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

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

        if (user != null) {
            //使用md5解码
            String passwordWithSalt = password + user.getSalt();
            String encryptedPassword = DigestUtils.md5DigestAsHex(passwordWithSalt.getBytes());
            return encryptedPassword.equals(user.getPassword());
        }

        return false;
    }

    @Override
    public boolean registerUser(User user) {
        //确保账号密码不为空
        if (user.getAccount() == null || user.getPassword() == null) {
            return false;
        }
        //确保账号唯一
        if (userDao.getUserByUsername(user.getAccount()) != null) {
            return false;
        }
        // 生成随机盐
        String salt = String.valueOf(System.currentTimeMillis());
        user.setSalt(salt);
        // 使用MD5加密密码
        String passwordWithSalt = user.getPassword() + salt;
        String encryptedPassword = DigestUtils.md5DigestAsHex(passwordWithSalt.getBytes());
        user.setPassword(encryptedPassword);
        int rowsAffected = userDao.insert(user);
        return rowsAffected > 0;
    }
}
