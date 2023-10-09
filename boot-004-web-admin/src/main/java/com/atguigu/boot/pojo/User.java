package com.atguigu.boot.pojo;

import lombok.Data;
import org.springframework.stereotype.Repository;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/9 20:34
 * @since 1.0
 */
@Data
@Repository
public class User {
    private String username;
    private String password;
}
