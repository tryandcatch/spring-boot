package com.hxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Huangxiutao on 2017/6/27.
 */
@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("userName","hxt");
        return "index";
    }

    @RequestMapping("/getJson")
    @ResponseBody
    public String getJson(){

        return "";
    }
}
