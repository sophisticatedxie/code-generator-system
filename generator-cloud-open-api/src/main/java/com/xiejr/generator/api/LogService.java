package com.xiejr.generator.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @program: code-generator-system
 * @description: LogService
 * @author: xjr
 * @create: 2020-11-08 18:24
 **/
@FeignClient("log-center-service")
@RequestMapping("/log")
public interface LogService {

    @PostMapping("/record")
    String test(@RequestParam("code") String code);
}
