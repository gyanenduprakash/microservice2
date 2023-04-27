package com.java4s.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringJava4sController {
	@RequestMapping("/microservicetwo")
	public String welcome() {
		return "Hello , I am from microserice two";
	}


}
