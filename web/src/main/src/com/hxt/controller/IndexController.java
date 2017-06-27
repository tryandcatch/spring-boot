package com.hxt.controller;

import com.hxt.controller.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Huangxiutao on 2017/6/27.
 */
@Controller
public class IndexController {
    /**
     * 返回页面
     * @param model
     * @return
     */
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("userName","hxt");
        return "index";
    }


    /**
     * 返回json
     * @return
     */
    @RequestMapping("/getJson")
    @ResponseBody
    public User getJson(){
        User user=new User();
        user.setUserName("hxt");
        user.setUserName("张三");
        user.setPassWord("ssssss");
        return user;
    }
}
