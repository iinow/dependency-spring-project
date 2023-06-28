package com.h1.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.h2.common.core.CoreService;

import jakarta.annotation.PostConstruct;

@RequestMapping("/foo")
@RestController
public class TestController {

    @Autowired
    private CoreService coreService;

    @PostConstruct
    public void init() {
        coreService.foo();
    }
    
    @GetMapping
    public String ss() {
        coreService.foo();
        return "dkfjdkfjdk";
    }
}
