package com.yongdubot.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yongdubot.server.mappers")
public class YongdubotApplication {

	public static void main(String[] args) {
		SpringApplication.run(YongdubotApplication.class, args);
	}
	
}
