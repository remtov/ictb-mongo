package com.example.demo.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.vo.User;

public interface UserDAO extends MongoRepository<User, Long>{
		public List<User> findAll();

}
