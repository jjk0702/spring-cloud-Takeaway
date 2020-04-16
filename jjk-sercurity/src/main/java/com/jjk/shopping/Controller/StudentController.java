package com.jjk.shopping.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/stu")
@RestController
@CrossOrigin
public class StudentController {

    @GetMapping("")
    public String get(){
        return "stu";
    }
}
