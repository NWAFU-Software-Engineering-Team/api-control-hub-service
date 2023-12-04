package com.team.aphs;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.team.aphs.Dao")
public class AphsApplication {
    public static void main(String[] args) {
        SpringApplication.run(AphsApplication.class, args);
    }
}
