package com.example.demo.vo;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection="user")
public class User {
	
	private String id;
	private int age;
	private String name;
	
	

}
