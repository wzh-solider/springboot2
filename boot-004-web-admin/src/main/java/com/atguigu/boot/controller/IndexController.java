package com.atguigu.boot.controller;

import com.atguigu.boot.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/9 20:12
 * @since 1.0
 */
@Slf4j
@Controller
public class IndexController {

    @Autowired
    private User user;

    /**
     * 登录页面
     * @return
     */
    @GetMapping({"/", "/login"})
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String main(User user, HttpSession session){
        // log.info("username = " + username + ", password = " + password);
        if (!StringUtils.isEmpty(user.getUsername()) && !StringUtils.isEmpty(user.getPassword())) {
            session.setAttribute("user", user);
            return "redirect:/main.html";
        }
        return "login";
    }

    /**
     * 主页面
     */
    @GetMapping("/main.html")
    public String mainPage() {
        return "main";
    }
}
