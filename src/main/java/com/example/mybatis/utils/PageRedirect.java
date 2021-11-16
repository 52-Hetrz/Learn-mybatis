package com.example.mybatis.utils;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName PageRedirect
 * @Description
 * @Author Life
 * @Date 2021/11/16 15:40
 * @Version 1.0
 */

@Controller
public class PageRedirect {
    @RequestMapping("/index")
    public String toIndex(){
        return "index";
    }
}
