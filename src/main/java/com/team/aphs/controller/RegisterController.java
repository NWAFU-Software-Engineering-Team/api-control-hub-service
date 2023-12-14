package com.team.aphs.controller;

import com.team.aphs.Dto.RegistrationRequest;
import com.team.aphs.api.CommonResult;
import com.team.aphs.model.User;
import com.team.aphs.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/register")
public class RegisterController {

    private final UserService userService;

    @Autowired
    public RegisterController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    @ResponseBody
    public CommonResult register(@RequestBody RegistrationRequest registrationRequest) {
        User user = new User();
        user.setAccount(registrationRequest.getUsername());
        user.setPassword(registrationRequest.getPassword());
        if (!userService.registerUser(user)) {
            return CommonResult.failed();
        } else {
            return CommonResult.success(null, "注册成功");
        }
    }
}

