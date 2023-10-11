package com.atguigu.boot.service;

import com.atguigu.boot.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/11 16:32
 * @since 1.0
 */
@SpringBootTest
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void testUserList() {
        userService.UserList();
    }

    @Test
    public void testFindUser() {
        User user = userService.findUser(1);
        System.out.println(user);
    }
}
