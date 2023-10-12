package com.atguigu.boot;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class Boot008AdminserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(Boot008AdminserverApplication.class, args);
	}

}
