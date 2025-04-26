package com.Atri.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {
    private Integer userId;
    private String username;
    private String password;
    private String email;
    private LocalDateTime registerTime;
    private LocalDateTime lastLoginTime;
    private String role;  // 建议使用枚举
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}

// 枚举类
