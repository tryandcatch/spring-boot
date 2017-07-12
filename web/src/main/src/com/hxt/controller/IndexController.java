package com.hxt.controller;

import com.hxt.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Huangxiutao on 2017/6/27.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String in(Model model){
        return "redirect:/index";
    }

    /**
     * 返回页面
     * @param model
     * @return
     */
    @RequestMapping("/index")
    public String index(Model model){
        return "index";
    }

    @RequestMapping("/hello")
    public String hello(Model model,String userName){
        model.addAttribute("userName",userName);
        return "hello";
    }

    /**
     * 返回json
     * @return
     */
    @RequestMapping("/getUser")
    @ResponseBody
    public User getJson(){
        User user=new User();
        user.setUserName("hxt");
        user.setUserName("张三");
        user.setPassWord("ssssss");
        return user;
    }

    @RequestMapping(value = {"/asdf","/ff"})
    public String hello() throws Exception {
        throw new NullPointerException("发生错误");
    }


}
