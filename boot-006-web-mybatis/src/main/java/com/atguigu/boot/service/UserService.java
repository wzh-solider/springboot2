package com.atguigu.boot.service;

import com.atguigu.boot.pojo.User;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/11 16:21
 * @since 1.0
 */
public interface UserService {

    /**
     * 查询用户列表
     */
    void UserList();

    /**
     * 根据id查询用户
     */
    User findUser(Integer id);

}
