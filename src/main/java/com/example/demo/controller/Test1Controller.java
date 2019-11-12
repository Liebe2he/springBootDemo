package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mojianxiong
 * @create 2019-11-12
 */
@Controller
@RequestMapping("api/v1/test1")
public class Test1Controller {

    /*
    * jsp文件映射,需要在application.properties文件配置
    * author mojianxiong
    * date：20191112
    */
    @GetMapping("/test_page")
    public String testPage() {
        return "test_page";
    }
}
