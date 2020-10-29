package com.example.demo01.Controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class helloController {
    @RequestMapping(value = "/hello")
    public String hello(){
        return "Hello,World!这是我的第一个SpringBoot程序~";
    }
}
