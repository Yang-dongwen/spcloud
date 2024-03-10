package com.spcloud.dwcode.pament8001;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.spcloud.dwcode.pament8001.dao"})
public class Payment8001Application {

    public static void main(String[] args) {
        SpringApplication.run(Payment8001Application.class, args);
    }

}
