package com.springbootApp.springbootApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/App")
public class ConClass {

	@GetMapping("/getSay")
	public String say(){
		return"Hi";
	}
	@GetMapping("/sayHello")
	public String sayHellow(){
		return"Hi Dear Ram How r u?";
	}
}
