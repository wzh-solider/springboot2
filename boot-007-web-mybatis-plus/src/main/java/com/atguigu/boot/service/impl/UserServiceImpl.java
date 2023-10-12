package com.atguigu.boot.service.impl;

import com.atguigu.boot.mapper.UserMapper;
import com.atguigu.boot.pojo.User;
import com.atguigu.boot.service.UserService;
import io.micrometer.core.instrument.Counter;
import io.micrometer.core.instrument.MeterRegistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/12 16:23
 * @since 1.0
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    Counter counter;

    public UserServiceImpl(MeterRegistry registry) {
        counter = registry.counter("userService.userList.count");
    }

    @Override
    public List<User> userList() {
        counter.increment();
        return userMapper.selectList(null);
    }
}
