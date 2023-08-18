package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController2 {
	@Value("${var}")
	private String studentName;
	@GetMapping("/")
	public String getName()
	{
		return "Welcome"+studentName+"!";
	}
}
