package mongodemo;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class MongoDBDemo {

	private static MongoClient mongoClient;
	private static MongoDatabase database;
	private static MongoCollection<Document> productsCollection;
	
	public static void main(String[] args) {
		
		// mongodb local url
		
		String localDBURL ="mongodb://localhost:27017";
		
		mongoClient = MongoClients.create(localDBURL);
		
		// Get database and collection
		database = mongoClient.getDatabase("sl-we-estore");
		productsCollection = database.getCollection("products");
		
		
		
		// Let's insert a new product
		Document product = new Document("name", "HP printer").append("price", 2500.25);
		
		productsCollection.insertOne(product);
		
		System.out.println(" successfully inserted a new product ");

	}

}
