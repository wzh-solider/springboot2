package com.atguigu.boot;

import com.atguigu.boot.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

@SpringBootTest
@Slf4j
class Boot005WebDataApplicationTests {

	@Autowired
	User user;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	DataSource dataSource;

	@Test
	void contextLoads() {
		List<Map<String, Object>> list = jdbcTemplate.queryForList("select * from t_user");
		list.forEach(System.out::println);
	}

	@Test
	void testDataSource() {
		log.info("数据源类型：{}", dataSource.getClass());
	}

}
