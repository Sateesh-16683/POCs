package com.example.demo.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APITest {
	
	@GetMapping("/get")
	public String getData() {
		return "Hello";
		
	}
	
	

}
