package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestingController {

	
	@GetMapping("/message")
	public String getMessage() {
		return "Helllo ";
	}
	
	@GetMapping("/post")
	public String getPost() {
		return "Helllo from post method";
	}
}
