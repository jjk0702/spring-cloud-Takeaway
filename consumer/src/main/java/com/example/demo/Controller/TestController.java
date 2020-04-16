package com.example.demo.Controller;

import com.example.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@CrossOrigin
@RestController
public class TestController {


    @Autowired
    UserService userService;

    @GetMapping("/value")
    public String getValue(){
        return "你好！";
    }



    @GetMapping("/user")
    public String getUser(){
        return "consumer:"  + userService.getUser();
    }
}
