package com.hxt.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.hxt.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Huangxiutao on 2017/7/19.
 */
@RestController//相当于@Controller 加 方法前 @ResponseBody
@Api(value = "用户模块")
@RequestMapping("/user")
public class UserController {

    /**
     * 获取单个用户
     * @param id
     * @return
     */
    @ApiOperation(value = "获取单个用户",notes = "根据Id获取单个用户")
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String getUserById(@ApiParam(value = "用户Id",required = true)@PathVariable Long id){
        //真实场景下应该是获取数据库中
        Map<Long,User> userMap=new HashMap<Long, User>();
        userMap.put(1l,new User(1l,"张三","男"));
        userMap.put(2l,new User(2l,"王二","男"));
        userMap.put(3l,new User(3l,"Kevin Wong","男"));
        User user=userMap.get(id);
        return JSON.toJSONString(user);
    }

    /**
     * 获取所有用户
     * @return
     */
    @ApiOperation(value = "获取所有用户",notes = "获取所有用户信息")
    @RequestMapping(value = "/getList",method = RequestMethod.GET)
    private String getAllUser(){
        List<User> users= new ArrayList<User>();
        users.add(new User(1l,"张三","男"));
        users.add(new User(2l,"王二","男"));
        users.add(new User(3l,"Kevin Wong","男"));
        return JSON.toJSONString(users);
    }
}
