package com.example.boot.controller;

import com.example.boot.controller.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/12 19:08
 * @since 1.0
 */
@RestController
public class HelloController {

    // @Value("${person.name:李四}")
    // private String name;

    @Autowired
    private Person person;

    @GetMapping("/")
    public Person hello() {
        return person;
    }
}
