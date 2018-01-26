package com.sarashwathy.misc;

import java.util.Arrays;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class CustomerMongo {

	public static void main(String[] args) {
		MongoClient myClient = new MongoClient();
		MongoDatabase myDb = myClient.getDatabase("test");
		MongoCollection<Document> myCollection = myDb.getCollection("insertTest");

		Document myDoc = new Document("name", "kumar")
				.append("age", 26)
				.append("hobbies",Arrays.asList("asdf","asdf") );
		
		
		MongoHelper.printJSON(myDoc);
		myCollection.insertOne(myDoc);
		
		myDoc.remove("_id");
		myCollection.insertOne(myDoc);
		MongoHelper.printJSON(myDoc);
	}

}
