package com.atguigu.boot.config;

import com.alibaba.druid.pool.DruidAbstractDataSource;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.stat.DruidStatService;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Description;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Solider
 * @version 1.0
 * @Date 2023/10/10 20:20
 * @since 1.0
 */
@Deprecated
@Configuration
public class DataSourceConfig {

    @Bean
    @ConfigurationProperties("spring.datasource")
    public DataSource dataSource() throws SQLException {
        DruidDataSource dataSource = new DruidDataSource();
        // dataSource.setUrl("jdbc:mysql://localhost:3306/spring6");
        // dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        // dataSource.setUsername("root");
        // dataSource.setPassword("wzh7230610");
        dataSource.setFilters("stat");

        return dataSource;
    }

    /**
     * 配置druid的监控页功能
     */
    @Bean
    public ServletRegistrationBean statViewServlet() {

        StatViewServlet statViewServlet = new StatViewServlet();
        ServletRegistrationBean<StatViewServlet> registrationBean =
                new ServletRegistrationBean<>(statViewServlet, "/druid/*");
        HashMap<String, String> initParamsMap = new HashMap<>();
        initParamsMap.put("loginUsername", "user");
        initParamsMap.put("loginPassword", "123456");
        registrationBean.setInitParameters(initParamsMap);
        return registrationBean;
    }

    /**
     * 配置web监控功能
     */

    @Bean
    public FilterRegistrationBean webStatFilter() {
        WebStatFilter webStatFilter = new WebStatFilter();
        FilterRegistrationBean<WebStatFilter> filterRegistrationBean =
                new FilterRegistrationBean<>(webStatFilter);
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/*"));
        filterRegistrationBean.addInitParameter("exclusions", "/druid/*");
        return filterRegistrationBean;
    }
}
