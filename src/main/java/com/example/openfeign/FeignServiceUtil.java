package com.example.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "typicode", url = "http://localhost:9090")
public interface FeignServiceUtil {

    @GetMapping("/payment")
    public String getRes();
}
