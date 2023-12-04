package com.team.aphs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@MapperScan("com.team.aphs.Dao")
@RequestMapping("/api-control-hub")
public class AphsApplication {
	public static void main(String[] args) {
		SpringApplication.run(AphsApplication.class, args);
	}
}
