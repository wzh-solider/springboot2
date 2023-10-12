package com.atguigu.boot.service;

import com.atguigu.boot.pojo.User;

import java.util.List;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/12 16:21
 * @since 1.0
 */
public interface UserService {

    /**
     * 查询所有用户信息
     */
    List<User> userList();
}
