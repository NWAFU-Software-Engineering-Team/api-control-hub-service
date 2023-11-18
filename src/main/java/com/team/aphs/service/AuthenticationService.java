package com.team.aphs.service;

import com.team.aphs.mapper.UserMapper;
import com.team.aphs.model.User;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class AuthenticationService {

    private final UserMapper userMapper;
    @Autowired
    public AuthenticationService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public Map<String, Object> authenticate(String username, String password) {
        Map<String, Object> result = new HashMap<>();
        User user = userMapper.findByUsername(username);

        if (user != null && validatePassword(password, user.getPassword(), user.getSalt())) {
            // 身份验证成功
            String accessToken = generateAccessToken(user);
            user.setToken(accessToken);
            userMapper.updateUserToken(user);

            result.put("code", 200);
            result.put("data", Collections.singletonMap("access_token", accessToken));
            result.put("message", "成功");
        } else {
            // 身份验证失败
            result.put("code", 500);
            result.put("message", "用户名或密码错误");
        }

        return result;
    }

    private boolean validatePassword(String inputPassword, String storedPassword, String salt) {
        // 使用相同的加密算法验证密码
        String hashedInputPassword = hashPassword(inputPassword, salt);
        return hashedInputPassword.equals(storedPassword);
    }

    private String hashPassword(String password, String salt) {
        // 使用合适的加密算法（如MD5）对密码进行哈希，此处仅为示例
        // 注意：实际应用中，应该使用更强大的加密算法，如BCrypt
        return DigestUtils.md5Hex(password + salt);
    }

    private String generateAccessToken(User user) {
        // 生成访问令牌，此处使用简单的UUID，实际应用中可能需要使用更安全的方式
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}

