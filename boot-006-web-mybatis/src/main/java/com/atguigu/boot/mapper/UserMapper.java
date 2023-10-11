package com.atguigu.boot.mapper;

import com.atguigu.boot.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/11 16:19
 * @since 1.0
 */
public interface UserMapper {

    /**
     * 查询所有用户
     * @return
     */
    @Select("select * from t_user")
    List<User> selectAll();

    /**
     * 根据id查询用户
     * @param id
     * @return
     */
    @Select("select * from t_user where id = #{id}")
    User selectUserById(Integer id);

}
