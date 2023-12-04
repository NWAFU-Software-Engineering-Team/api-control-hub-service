package com.team.aphs.controller;

import com.team.aphs.Dto.LoginRequest;
import com.team.aphs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String login(@RequestBody LoginRequest loginRequest) {
        String username = loginRequest.getUsername();
        String password = loginRequest.getPassword();

        // Authenticate user
        boolean isAuthenticated = userService.authenticateUser(username, password);

        if (isAuthenticated) {
            return "Login successful";
        } else {
            return "Invalid credentials";
        }
    }
}
