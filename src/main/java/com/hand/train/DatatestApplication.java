package com.hand.train;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hand.train.mapper")
public class DatatestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatatestApplication.class, args);
	}

}
