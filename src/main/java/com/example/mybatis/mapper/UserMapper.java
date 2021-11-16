package com.example.mybatis.mapper;


import com.example.mybatis.dao.UserDao;
import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;

@Mapper
public interface UserMapper {
    void insertUser(UserDao user);
    Integer selectUserIdByName(String name);
    void deleteUser(int id);
    ArrayList<UserDao> selectAllUsers();
}
