package cn.com.fwen.springboot.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "person")
public class QuickStartController02 {

    private String name;
    private Integer age;

    @RequestMapping("/quick02")
    public @ResponseBody String quick(){
        return "springboot 访问成功!name="+name+"age="+age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
