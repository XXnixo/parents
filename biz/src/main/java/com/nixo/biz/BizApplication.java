package com.nixo.biz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: lyx
 * @Date: 2020/6/1 22:48
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
public class BizApplication {

    public static void main(String[] args) {
        SpringApplication.run(BizApplication.class,args);
    }
}
