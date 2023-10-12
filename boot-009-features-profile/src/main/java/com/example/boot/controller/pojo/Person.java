package com.example.boot.controller.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/12 19:38
 * @since 1.0
 */
@ConfigurationProperties(prefix = "person")
public interface Person {
    String getName();
    Integer getAge();
}
