package com.atguigu.boot;

import com.atguigu.boot.pojo.Car;
import com.atguigu.boot.pojo.Person;
import com.atguigu.boot.pojo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/7 23:51
 * @since 1.0
 */

/**
 * @SpringBootApplication 来标注一个主程序类，说明这是一个Spring Boot应用
 */
@SpringBootApplication(scanBasePackages = "com.atguigu.boot")
public class MainApplication {

    public static void main(String[] args) {
        // 1、获取IoC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        // 2、检查组件
        String[] beanDefinitionNames = run.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println(beanDefinitionName);
        }

        // User user = run.getBean("user", User.class);
        // System.out.println(user);
        // Person person = run.getBean("person", Person.class);
        // System.out.println(person);

        System.out.println("============");
        // User user1 = run.getBean("user", User.class);
        boolean user1 = run.containsBean("user");
        System.out.println("IoC容器中的User：" + user1);
        // 测试IoC容器中是否含有person组件
        boolean person1 = run.containsBean("person");
        System.out.println("IoC容器中的Person：" + person1);

        System.out.println("=====================");
        // 通过配置文件，对Car的属性进行赋值
        Car car = run.getBean("car", Car.class);
        System.out.println(car);
    }
}
