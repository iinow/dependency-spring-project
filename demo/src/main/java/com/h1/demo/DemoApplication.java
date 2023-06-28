package com.h1.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.h2.common.core.CoreService;

import jakarta.annotation.PostConstruct;

@ComponentScan(basePackages = {"com.h2.common.core"})
@SpringBootApplication
public class DemoApplication {

	@Autowired
    private CoreService coreService;

	@PostConstruct
	public void dddd() {
		System.out.println("dkdkdkdkdkdkdkdkdkdkd");
		coreService.foo();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
