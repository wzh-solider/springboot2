package com.example.boot.controller.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/12 19:37
 * @since 1.0
 */
@Profile("prod") // 生产环境下激活
@Data
@Repository

public class Boss implements Person{

    private String name;
    private Integer age;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getAge() {
        return this.age;
    }
}
