package com.atguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/8 22:48
 * @since 1.0
 */
@RestController
public class DemoController {

    @RequestMapping("/1.gif")
    public String demo() {
        return "/res/aaaa.gif";
    }

    // @RequestMapping(value = "/user", method = RequestMethod.GET)
    @GetMapping("/user")
    public String getUser() {
        return "GET-张三";
    }

    // @RequestMapping(value = "/user", method = RequestMethod.POST)
    @PostMapping("/user")
    public String saveUser() {
        return "POST-张三";
    }


    // @RequestMapping(value = "/user", method = RequestMethod.PUT)
    @PutMapping("/user")
    public String putUser() {
        return "PUT-张三";
    }

    // @RequestMapping(value = "/user", method = RequestMethod.DELETE)
    @DeleteMapping("/user")
    public String deleteUser() {
        return "DELETE-张三";
    }
}
