package com.atguigu.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.atguigu.boot.mapper")
@SpringBootApplication
public class Boot006WebMybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(Boot006WebMybatisApplication.class, args);
    }

}
