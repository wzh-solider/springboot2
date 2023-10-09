package com.atguigu.boot.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Repository;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/8 11:32
 * @since 1.0
 */
@Data
@Repository
@ConfigurationProperties("mycar") // 通过配置文件对属性进行赋值
public class Car {
    private String brand;
    private Integer price;
}
