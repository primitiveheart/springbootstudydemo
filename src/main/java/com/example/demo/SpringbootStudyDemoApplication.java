package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootApplication
@MapperScan("com.example.demo.dao")
public class SpringbootStudyDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootStudyDemoApplication.class, args);
	}
}
