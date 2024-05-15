package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Feign.OpenFeignDemo;

@RestController
public class OpenDataApi {
	@Autowired
	private OpenFeignDemo api;
	
	
	
	
	@GetMapping("/getdata")
	public String  getData() {
		String welcom = api.invokeWelcom();
		return  welcom+",This is Your Data";
	}

}
