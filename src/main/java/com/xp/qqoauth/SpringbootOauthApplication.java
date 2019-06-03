package com.xp.qqoauth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "com.xp.qqoauth.mapper")
@SpringBootApplication
public class SpringbootOauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootOauthApplication.class, args);
    }

}
