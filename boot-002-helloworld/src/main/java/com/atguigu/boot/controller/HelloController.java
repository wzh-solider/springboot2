package com.atguigu.boot.controller;

import com.atguigu.boot.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/8 17:55
 * @since 1.0
 */
@RestController
public class HelloController {

    @Autowired
    private Person person;

    @RequestMapping("/hello")
    public Person hello() {
        return person;
    }
}
