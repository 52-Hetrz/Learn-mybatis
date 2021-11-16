package com.example.mybatis.controller;

import com.example.mybatis.VO.MessageResult;
import com.example.mybatis.dao.UserDao;
import com.example.mybatis.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;

/**
 * @ClassName UserController
 * @Description
 * @Author Life
 * @Date 2021/11/16 15:01
 * @Version 1.0
 */

@RestController
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @RequestMapping(value = "/user/insert/{name}/{password}/{mail}/{image}",method = RequestMethod.POST)
    public MessageResult insertUser(@PathVariable("name")String name,
                                    @PathVariable("password")String password,
                                    @PathVariable("mail")String mail,
                                    @PathVariable("image")String image
                                    ){
        Integer id = userService.insertUser(name,password,mail,image);
        if(id!=null){
            return new MessageResult(id,200,"success");
        }else{
            return new MessageResult(null,400,"error");
        }
    }

    @RequestMapping(value = "/user/selectAll",method = RequestMethod.POST)
    public MessageResult getAllUsers(){
        ArrayList<UserDao> result = userService.selectAllUsers();
        if(result!=null){
            return new MessageResult(result,200,"success");
        }else{
            return new MessageResult(null, 400,"error");
        }
    }

    @RequestMapping(value = "/user/deleteUser/{id}",method = RequestMethod.POST)
    public MessageResult deleteUser(@PathVariable("id") Integer id){
        userService.deleteUser(id);
        return null;
    }



}
