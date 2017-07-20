package com.hxt;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMethod;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.RequestHandlerProvider;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Huangxiutao on 2017/7/19.
 */
@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Bean
    public Docket createRestAPI(){
        ApiInfo apiInfo=new ApiInfoBuilder()
                .title("XXX项目接口文档")
                .description("这是XXX项目的接口文档")
                .contact("hxt")
                .license("©xxx项目组").licenseUrl("https://github.com/tryandcatch")
                .version("V1.0")
                .build();
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)
                .globalResponseMessage(RequestMethod.GET,customerMessage())//为Get方法配置错误提示信息
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hxt.controller"))
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))//为属于com.hxt.controller包下且注解了 ApiOperation的方法添加接口文档
                .paths(PathSelectors.any())
                .build();
    }

    private List<ResponseMessage> customerMessage(){
        List<ResponseMessage> responseMessages=new ArrayList<ResponseMessage>();
        ResponseMessage r=new ResponseMessageBuilder()
                .code(500)
                .message("系统异常")
                .responseModel(new ModelRef("Error"))
                .build();
        responseMessages.add(r);
        r=new ResponseMessageBuilder()
                .code(401)
                .message("参数错误")
                .build();
        responseMessages.add(r);
        return responseMessages;
    }
}
