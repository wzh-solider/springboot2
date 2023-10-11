package com.atguigu.boot.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/11 18:26
 * @since 1.0
 */
@SpringBootTest
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        userMapper.selectList(null).forEach(System.out::println);
    }
}
