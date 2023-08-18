package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiController3 {
	@Value("${color}")
	String yourFavcolor;
	@GetMapping("color")
	public String getMyFav() {
		return "My favorite color is"+yourFavcolor;
	}
}
