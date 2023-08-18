package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@Value("${var}")
	private String name;
	@GetMapping("/srk")
	public String fun()
	{
		return "Hello"+name+" Nice to meet you !";
	}
}
