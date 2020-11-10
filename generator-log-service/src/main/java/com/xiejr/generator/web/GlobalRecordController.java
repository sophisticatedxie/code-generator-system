package com.xiejr.generator.web;

import org.springframework.web.bind.annotation.*;

/**
 * @program: code-generator-system
 * @description:
 * @author: xjr
 * @create: 2020-11-08 18:20
 **/
@RestController
@RequestMapping("/log")
public class GlobalRecordController {

    @PostMapping("/record")
    public String test(@RequestParam("code") String code){
        return String.format("日志中心已记录,您本次的编码是%s",code);
    }
}
