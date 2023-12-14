package com.team.aphs.controller;

import com.team.aphs.Dto.LoginRequest;
import com.team.aphs.api.CommonResult;
import com.team.aphs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/login")
public class LoginController {

    private final UserService userService;

    @Autowired
    public LoginController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    @ResponseBody
    public CommonResult login(@RequestBody LoginRequest loginRequest) {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();

        // Authenticate user
        boolean isAuthenticated = userService.authenticateUser(username, password);
        Map<String, String> tokenMap = new HashMap<>();
        String token = "bqddxxwqmfncffacvbpkuxvwvqrhln";
        tokenMap.put("access_token", token);

        if (isAuthenticated) {
            return CommonResult.success(tokenMap);
        } else {
            return CommonResult.validateFailed("用户名或密码错误");
        }
    }
}
