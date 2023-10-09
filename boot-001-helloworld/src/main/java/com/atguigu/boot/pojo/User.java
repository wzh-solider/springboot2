package com.atguigu.boot.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Repository;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/8 9:31
 * @since 1.0
 */

// 使用lombok注解，简化代码
@Data // 生成get、set方法
@AllArgsConstructor // 生成全参构造器
@NoArgsConstructor // 生成无参构造器
@ToString // 生成toString方法
public class User {
    private String name;
    private Integer age;
    private String sex;
}
