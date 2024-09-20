package com.example.springbootcrudwithsplunkintegration.controller;

import com.example.springbootcrudwithsplunkintegration.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
    @Autowired
    private MyService myService;
    
    @GetMapping("/doSomething")
    public String doSomething() {
        return myService.doSomething();
    }
}