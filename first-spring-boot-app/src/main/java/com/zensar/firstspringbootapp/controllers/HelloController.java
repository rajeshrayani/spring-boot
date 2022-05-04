package com.zensar.firstspringbootapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
//@Controller
@RestController
public class HelloController {
	@RequestMapping("/")
	//@ResponseBody
	public String sayHello() {
		return "<h2> Hello Spring Boot...!!</h2>";
	}

}
