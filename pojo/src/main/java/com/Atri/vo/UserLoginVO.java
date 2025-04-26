package com.Atri.vo;

import lombok.Data;

@Data
public class UserLoginVO {
    private Integer id;
    private String userId;
    private String userName;
    private String password;
    private String email;
    private Integer registerTime;
    private String lastLoginTime;
    private Integer role;

    private String token;
}
