package com.atguigu.boot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/7 23:52
 * @since 1.0
 */
@Slf4j
@RestController // @RestController = @Controller + @ResponseBody
public class HelloController {

    @RequestMapping("/hello")
    public String handle01() {
        log.info("请求进来了...");
        return "Hello, Spring Boot 2!";
    }
}
