package com.hxt.exception;

import com.sun.org.apache.regexp.internal.RE;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * 全局异常控制器
 * Created by Huangxiutao on 2017/7/12.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
    public static final String ERROR_VIEW="error/error";

    @ExceptionHandler(value = Exception.class)
    public ModelAndView defaultError(HttpServletRequest req,Exception e){
        ModelAndView mv=new ModelAndView();
        mv.addObject("exception",e);
        mv.addObject("url",req.getRequestURL());
        mv.addObject("authtype",req.getAuthType());
        mv.addObject("method",req.getMethod());
        mv.setViewName(ERROR_VIEW);
        return mv;
    }

    @ExceptionHandler(value = NullPointerException.class)
    @ResponseBody
    public String defaultRestError(HttpServletRequest req,NullPointerException e){
        String result="{" +
                "code:100,msg:'errormsg',url:'"+req.getRequestURL()+"'}";
        return result;
    }


}
