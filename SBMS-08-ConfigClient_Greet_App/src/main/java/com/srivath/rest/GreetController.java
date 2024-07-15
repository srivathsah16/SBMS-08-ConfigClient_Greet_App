package com.srivath.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {

	@Value("${msg}")
	private String greetString;
	
	@GetMapping("/greet")
	public String greet() {
		return greetString;
	}
}
