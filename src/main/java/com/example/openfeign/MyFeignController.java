package com.example.openfeign;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFeignController {

    @Autowired
    private FeignServiceUtil feignServiceUtil;

    @GetMapping("/reqone")
    public String myfun(){
        return feignServiceUtil.getRes();
    }
}
