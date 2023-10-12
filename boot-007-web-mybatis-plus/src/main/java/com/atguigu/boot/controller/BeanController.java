package com.atguigu.boot.controller;

import com.atguigu.boot.pojo.User;
import com.atguigu.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/12 16:21
 * @since 1.0
 */
@RestController
public class BeanController {

    @Resource(name = "userServiceImpl")
    private UserService userService;

    @RequestMapping("/users")
    public List<User> users() {
        return userService.userList();
    }

}
