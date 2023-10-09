package com.atguigu.boot.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Repository;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/8 17:37
 * @since 1.0
 */
@ToString
@Data
@Repository
public class Pet {
    private String name;
    private Double weight;
}
