package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserDAO;

@RestController
public class UserController {

	@Autowired
	private UserDAO udao;

	@RequestMapping(value = "/users3", method = RequestMethod.GET)
	public String getUser3() {
		return udao.findAll().toString();
	}
}

