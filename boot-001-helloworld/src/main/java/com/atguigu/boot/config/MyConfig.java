package com.atguigu.boot.config;

import ch.qos.logback.core.db.DBHelper;
import com.atguigu.boot.pojo.Person;
import com.atguigu.boot.pojo.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/8 9:30
 * @since 1.0
 */

/**
 * proxyBeanMethods：指定代理Bean的方法
 *      true：表示以单例的方式代理 ==> Full模式
 *      false：表示以多例的方式代理 ==> Lite模式
 */
// @Import({User.class, DBHelper.class}) // 创建这两个类型的组件，组件名是全类名
@Configuration(proxyBeanMethods = true) // 告诉Spring Boot这是一个配置类
// @ImportResource("classpath:spring-config.xml") // 导入原生的xml配置文件
public class MyConfig {

    @Bean
    public User user() {
        User user = new User();
        return new User("张三", 13, "男");
    }

    @ConditionalOnBean(name = "user")
    @Bean
    public Person person() {
        Person person = new Person("小白", 10, "雄性");
        person.setUser(user());
        return person;
    }
}
