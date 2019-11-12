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

    @GetMapping("/get")
    public String Get() {
        return "get success!";
    }

    @GetMapping("/test_page")
    public String testPage() {
        return "test_page!";
    }
}
