package com.hxt.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Huangxiutao on 2017/7/19.
 */
@Controller
@Api(value = "首页")
public class IndexController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    @ApiOperation(value = "首页",notes = "首页")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/none",method = RequestMethod.GET)
//    @ApiOperation(value = "什么都没有",notes = "什么都没有")
    @ResponseBody
    public String none(){
        return "<h1>没有加入swagger中</h1>";
    }
}
