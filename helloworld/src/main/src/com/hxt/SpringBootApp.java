package com.hxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Huangxiutao on 2017/6/26.
 */
@SpringBootApplication
@RestController
//直接使用 @Controller 注解不行
public class SpringBootApp {
    //定义请求路径，根据RequestMapping来匹配路径，在这里所有的请求都会跳转到这个方法
    @RequestMapping("/")
    public String index(){
        return "<h1>Hello Spring Boot!</h1>";
    }

    public static void main(String[] args){
        SpringApplication.run(SpringBootApp.class,args);
    }
}
