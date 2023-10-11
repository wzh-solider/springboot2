package com.atguigu.boot.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.springframework.stereotype.Repository;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/11 18:21
 * @since 1.0
 */
@Data
@Repository
public class User {

    @TableField(exist = false)
    private String username;
    @TableField(exist = false)
    private String password;

    private Integer id;
    private String name;
    private Integer age;
    private String email;
}
