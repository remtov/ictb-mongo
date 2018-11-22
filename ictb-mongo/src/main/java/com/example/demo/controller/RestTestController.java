package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestTestController {
	
	@Value("${spring.data.mongodb.uri}")
	private String uri;
	
	@Value("${spring.data.mongodb.database}")
	private String database;
	
	@GetMapping("/")
	public String getTest() {
		return uri + "," + database;
	}
	
	
	

}
