package com.hxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Huangxiutao on 2017/6/27.
 */
@Controller
@RequestMapping("/index")
public class IndexController {
    @RequestMapping("/index")
    public String index(){

        return "";
    }
}
