package com.Atri.service.impl;

import com.Atri.dto.UserLoginDTO;
import com.Atri.entity.User;
import com.Atri.exception.UserLoginException;
import com.Atri.mapper.UserMapper;
import com.Atri.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(UserLoginDTO userLoginDTO) {
        // 登录逻辑
        String userId = userLoginDTO.getUserId();
        String password= userLoginDTO.getPassword();

        //根据UserId查询
        User user = userMapper.getByUsertId(userId);
        if (user==null){
            throw new UserLoginException("账号不存在");
        }
        password = DigestUtils.md5DigestAsHex(password.getBytes());
        if (!password.equals(user.getPassword())){
            throw new UserLoginException("密码错误");
        }

        return user;
    }
}
