package com.example.demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/v2/")
public class MySpringBootAppApplication {

//	public class MySpringBootAppController {

	    @GetMapping(value = "/getHello")
	    public String hello() {
	        return "Hello from Spring Boot on AWS Lambda!";
	    }
//	}
}
