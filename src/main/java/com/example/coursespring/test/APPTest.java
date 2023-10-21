package com.example.coursespring.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APPTest {
    

    @GetMapping("/test")
    public String test(){
        return "aditya123456";
    } 
}
