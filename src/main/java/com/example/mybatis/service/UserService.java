package com.example.mybatis.service;

import com.example.mybatis.dao.UserDao;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface UserService {
    Integer insertUser(String name, String password, String mail, String image);
    void deleteUser(Integer id);
    ArrayList<UserDao> selectAllUsers();
}
