package com.hxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Huangxiutao on 2017/6/27.
 */
@SpringBootApplication
@RestController
public class SpringBootApp {

    public static void main(String[] args){
        SpringApplication.run(SpringBootApp.class,args);
    }
}
