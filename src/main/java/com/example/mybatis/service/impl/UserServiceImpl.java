package com.example.mybatis.service.impl;

import com.example.mybatis.dao.UserDao;
import com.example.mybatis.mapper.UserMapper;
import com.example.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @ClassName UserServiceImpl
 * @Description
 * @Author Life
 * @Date 2021/11/16 14:51
 * @Version 1.0
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public Integer insertUser(String name, String password, String mail, String image) {
        if(userMapper.selectUserIdByName(name) == null){
            userMapper.insertUser(new UserDao(name,password,mail,image));
            return userMapper.selectUserIdByName(name);
        }
        return null;
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteUser(id);
    }

    @Override
    public ArrayList<UserDao> selectAllUsers() {
        return userMapper.selectAllUsers();
    }
}
