package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRest {
	
	@Autowired
	public Environment en;
	
	@GetMapping("/welcome")
	public String getWelcome() {
		String port = en.getProperty("server.port");
		return "Welcome to World,"+port;
		
	}

}
