package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author mojianxiong
 * @create 2019-11-11
 * 错误例子：访问该controller的接口会出现404异常
 * 原因：启动类所在的package必需要包含Controller所在的package，否则找不到
 */
@Controller
@RequestMapping("api/v1")
public class TestController {

    @GetMapping("test_get")
    @ResponseBody
    public String testGet() {
        return "get success!";
    }

}
