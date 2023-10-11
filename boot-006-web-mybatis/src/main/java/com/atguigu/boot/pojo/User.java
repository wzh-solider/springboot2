package com.atguigu.boot.pojo;

import lombok.Data;
import lombok.ToString;
import org.springframework.stereotype.Repository;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/11 16:17
 * @since 1.0
 */
@Data
@ToString
@Repository
public class User {
    private Integer id;
    private String realName;
    private Integer age;
}
