package com.team.aphs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.team.aphs.mapper")
public class AphsApplication {

	public static void main(String[] args) {
		SpringApplication.run(AphsApplication.class, args);
	}

}
