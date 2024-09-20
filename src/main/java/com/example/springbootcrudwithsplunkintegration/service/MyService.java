package com.example.springbootcrudwithsplunkintegration.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @HystrixCommand(fallbackMethod = "fallbackMethod")
    public String doSomething() {
        // Simulate a failure
        if (Math.random() < 0.2) {
            throw new RuntimeException("Something went wrong");
        }
        return "Success!";
    }

    public String fallbackMethod() {
        return "Fallback response";
    }
}