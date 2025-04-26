package com.Atri.controller;

import com.Atri.dto.UserLoginDTO;
import com.Atri.entity.Result;
import com.Atri.entity.User;
import com.Atri.properties.JwtProperties;
import com.Atri.service.UserService;
import com.Atri.utils.JwtUtil;
import com.Atri.vo.UserLoginVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
@Slf4j
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private JwtProperties jwtProperties;


    @PostMapping ("/login")
    public Result<Object> login(@RequestBody UserLoginDTO userLoginDTO) {
        log.info(userLoginDTO.toString());
        // TODO 登录逻辑
        User user = userService.login(userLoginDTO);
        // 登录成功后返回token
        UserLoginVO userLoginVO = new UserLoginVO();
        BeanUtils.copyProperties(user, userLoginVO);

        Map<String, Object> claims = new HashMap<>();
        claims.put("userId", user.getUserId());
        String token = JwtUtil.createJWT(
                jwtProperties.getUserSecretKey(),
                jwtProperties.getUserTtl(),
                claims);
        // 这里返回token，实际项目中应该返回json数据，包含token信息
        userLoginVO.setToken(token);
        return Result.success(userLoginVO);

    }
}
