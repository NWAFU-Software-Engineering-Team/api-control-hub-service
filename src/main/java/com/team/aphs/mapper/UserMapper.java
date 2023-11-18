package com.team.aphs.mapper;

import com.team.aphs.model.User;

public interface UserMapper {
    User findByUsername(String username);
    int updateUserToken(User user);
}

