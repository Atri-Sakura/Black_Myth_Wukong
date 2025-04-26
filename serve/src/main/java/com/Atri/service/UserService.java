package com.Atri.service;

import com.Atri.dto.UserLoginDTO;
import com.Atri.entity.User;

public interface UserService {
    User login(UserLoginDTO userLoginDTO);
}
