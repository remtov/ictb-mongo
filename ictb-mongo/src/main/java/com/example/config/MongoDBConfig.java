
package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.MongoClient;

public class MongoDBConfig extends AbstractMongoConfiguration{

	
	@Value("${spring.data.mongodb.uri}")
	private String uri;
	
	@Value("${spring.data.mongodb.database}")
	private String database;
	
	
	@Override
	public MongoClient mongoClient() {
		// 
		return new MongoClient(uri);
	}

	@Override
	protected String getDatabaseName() {
		// 
		return database;
	}
	
	
}

