## springboot
 > 最简单的示例
---
## 步骤
### 1. 创建maven webapp项目
![](https://raw.githubusercontent.com/tryandcatch/spring-boot/master/screenshot/helloworld/%E7%AC%AC%E4%B8%80%E6%AD%A5.png)

### 2. 填写项目配置
![](https://raw.githubusercontent.com/tryandcatch/spring-boot/master/screenshot/helloworld/%E7%AC%AC%E4%BA%8C%E6%AD%A5.png)
![](https://raw.githubusercontent.com/tryandcatch/spring-boot/master/screenshot/helloworld/%E7%AC%AC%E4%B8%89%E6%AD%A5.png)
![](https://raw.githubusercontent.com/tryandcatch/spring-boot/master/screenshot/helloworld/%E7%AC%AC%E5%9B%9B%E6%AD%A5.png)
### 3.添加maven依赖
```
  <parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>1.3.5.RELEASE</version>
  </parent>
  <dependencies>
    <!--junit测试包非必须-->
    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>3.8.1</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-web</artifactId>
      <version>1.5.3.RELEASE</version>
    </dependency>
  </dependencies>
  
```
### 4.在main下新建一个src，并将目录设置为Sources Root(如果有的话直接跳到下一步)
![](https://raw.githubusercontent.com/tryandcatch/spring-boot/master/screenshot/helloworld/%E7%AC%AC%E5%85%AD%E6%AD%A5.png)
### 5.编写“主入口”代码 SpringBootApp
```java
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
```

### 6.效果
项目运行正常，输入http://127.0.0.1:8080/   效果如下：
![](https://raw.githubusercontent.com/tryandcatch/spring-boot/master/screenshot/helloworld/%E6%95%88%E6%9E%9C.png)
