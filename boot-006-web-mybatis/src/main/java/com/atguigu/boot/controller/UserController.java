package com.atguigu.boot.controller;

import com.atguigu.boot.pojo.User;
import com.atguigu.boot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/11 17:13
 * @since 1.0
 */
@RestController
public class UserController {

    @Resource(name = "userServiceImpl")
    UserService UserService;

    @RequestMapping("/user/{id}")
    public User user(@PathVariable("id") Integer id) {
        return UserService.findUser(id);
    }
}
