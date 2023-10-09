package com.atguigu.boot.controller;

import com.atguigu.boot.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/10 19:53
 * @since 1.0
 */
@RestController
public class DemoController {

    @Autowired
    private User user;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/user")
    public List demo() {
        String sql = "select * from t_user";
        return jdbcTemplate.queryForList(sql);
    }
}
