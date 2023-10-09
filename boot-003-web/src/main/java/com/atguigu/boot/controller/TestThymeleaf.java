package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/9 19:51
 * @since 1.0
 */
@Controller
public class TestThymeleaf {

    @RequestMapping("/test")
    public String test(Model model) {
        model.addAttribute("msg", "Hello, Thymeleaf!");
        return "success";
    }
}
