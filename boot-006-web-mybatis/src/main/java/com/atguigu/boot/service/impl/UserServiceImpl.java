package com.atguigu.boot.service.impl;

import com.atguigu.boot.mapper.UserMapper;
import com.atguigu.boot.pojo.User;
import com.atguigu.boot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/11 16:21
 * @since 1.0
 */
@Service
@EnableTransactionManagement
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public void UserList() {
        userMapper.selectAll().forEach(System.out::println);
    }

    @Override
    public User findUser(Integer id) {
        return userMapper.selectUserById(id);
    }
}
