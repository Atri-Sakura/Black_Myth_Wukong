package com.Atri.mapper;

import com.Atri.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    //根据用户id查询用户信息
    @Select("select * from User where user_id = #{userId}")
    User getByUsertId(String userId);
}
