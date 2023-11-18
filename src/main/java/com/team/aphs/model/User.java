package com.team.aphs.model;

import lombok.Data;

import java.util.Date;

@Data
public class User {
    private Long userId;
    private String account;
    private String password;
    private String salt;
    private String name;
    private String avatar;
    private String phone;
    private String email;
    private Integer gender;
    private Integer status;
    private String description;
    private Date ctime;
    private String token;

    // 省略 getter 和 setter 方法
}
