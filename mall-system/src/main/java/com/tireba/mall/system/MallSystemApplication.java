package com.tireba.mall.system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.tireba.mall.system.mapper")
public class MallSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallSystemApplication.class, args);
    }

}
