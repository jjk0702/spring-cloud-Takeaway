package com.example.demo.Service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("service-provider")
public interface UserService {
    @RequestMapping(value = "/getUser",method = RequestMethod.GET)
    String getUser();
}
