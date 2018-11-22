package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class MDBTest {
	public static void main(String[] args) {
		MongoClient mc =  MongoClients.create("mongodb://localhost:27017");
		System.out.println("접속 완료");
		MongoDatabase mdb = mc.getDatabase("ict");
		MongoCollection<BasicDBObject> mcol = mdb.getCollection("user", BasicDBObject.class);
		
		BasicDBObject bdb = new BasicDBObject();
		bdb.append("name", "홍길동").append("age",20).append("id","test");
		mcol.insertOne(bdb);
		
		List<BasicDBObject> bdbList  = mcol.find().into(new ArrayList<BasicDBObject>());
		log.info("bdbList=>{}",bdbList);
	}

}
