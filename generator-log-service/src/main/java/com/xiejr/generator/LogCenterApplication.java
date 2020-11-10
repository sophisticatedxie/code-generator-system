package com.xiejr.generator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: code-generator-system
 * @description: 启动类
 * @author: xjr
 * @create: 2020-11-08 18:13
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class LogCenterApplication {
    public static void main(String[] args){
        SpringApplication.run(LogCenterApplication.class,args);
    }
}
