package com.lyq.bootdemos.demo03;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Y-Ling
 * description:
 * created_time: 2021/8/13 2:34
 */
@MapperScan("com.lyq.bootdemos.demo03.mapper")
@SpringBootApplication
public class SSMApplication {
    public static void main(String[] args) {
        SpringApplication.run(SSMApplication.class, args);
    }
}
