package com.jjk.Provider.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class TestController {

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public String getUser(){
        return "provider JJK";
    }
}
