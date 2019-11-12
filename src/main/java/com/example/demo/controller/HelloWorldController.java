package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author He
 * @create 2019-10-30 15:26
 */
@RestController
@RequestMapping("api/v1")
public class HelloWorldController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    /*
    * RequestMapping,get方式
    * author mojianxiong
    * date：20191112
    */
    @GetMapping("/get")
    public String Get() {
        return "get success2!";
    }

    @GetMapping("/get3")
    public String Get3() {
        System.out.println("热部署测试3333");
        return "get3 success!";
    }

}
