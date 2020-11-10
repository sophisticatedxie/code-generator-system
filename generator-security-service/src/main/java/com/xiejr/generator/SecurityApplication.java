package com.xiejr.generator;

import com.xiejr.generator.api.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


/**
 * @program: code-generator-system
 * @description:统一鉴权服务
 * @author: xjr
 * @create: 2020-11-07 15:23
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class SecurityApplication {


    public static void main(String[] args){
        SpringApplication.run(SecurityApplication.class,args);
    }


    @Autowired
    LogService logService;

    @GetMapping("/test/{code}")
    public String test(@PathVariable("code") String code){
        return logService.test(code);
    }

}
