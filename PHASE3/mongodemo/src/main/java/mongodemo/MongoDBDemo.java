package mongodemo;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;

public class MongoDBDemo {

	private static MongoClient mongoClient;
	private static MongoDatabase database;
	private static MongoCollection<Document> productsCollection;

	public static void main(String[] args) {

		// mongodb local url

		String localDBURL = "mongodb://localhost:27017";

//		mongoClient = MongoClients.create(localDBURL);

		String atlasURL = "mongodb+srv://user2:2ciBx3H5wDh1jXp7@cluster0.ixxay.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0";

		mongoClient = MongoClients.create(atlasURL);

		// Get database and collection
		database = mongoClient.getDatabase("sl-we-estore");
		productsCollection = database.getCollection("products");

		readProducts();

		System.out.println("\n\n Display products with price > 1500");
		readProductsPriceGreaterThanOrEqual(1500.0f);
		
		System.out.println("\n\n Display products with name cotainin HP");
		readProductsNameContaining("HP");
		
		//updateProductName("HP printer 2");  // docs will now have 
		
		System.out.println("\n\n updating product prices to 5000");
		updateProductPrice(5000.0f);
		
		System.out.println("\n\n deleting all product whose names start with HP");
		deleteByNameStarting("HP");

	}

	
	private static void updateProductPrice(float newPrice) {
		Bson filter = Filters.exists("price");  // all docs that have "price" key/attribute
		
		Bson update = Updates.set("price",newPrice);
		
		//productsCollection.updateOne(filter, update); // update the first matched doc	
		productsCollection.updateMany(filter, update); // update all the matched doc	
	}
	
	
	private static void updateProductName(String name) {
		Bson filter = Filters.eq("name", name);
		
		Bson update = Updates.set("name", name.toUpperCase());
		
		productsCollection.updateOne(filter, update); // update the first matched doc		
	}
	
	
	private static void insertProduct() {
		// Let's insert a new product
		Document product = new Document("name", "HP printer 2").append("price", 1500.25).append("warranty", 5);

		productsCollection.insertOne(product);

		System.out.println(" successfully inserted a new product ");
	}

	private static void readProducts() {

		// Find all products
		System.out.println("\nAll products:");

		productsCollection.find().forEach(doc -> System.out.println(doc.toJson()));

	}

	private static void readProductsNameContaining(String text) {

		// Find all products
		// System.out.printf("\n All products having text :%s", text);

		Bson filter = Filters.regex("name", text, "i"); // i for case insensitive match
		productsCollection.find(filter).forEach(doc -> System.out.println(doc.toJson()));

	}

	private static void readProductsPriceGreaterThanOrEqual(float price) {

		// Find all products
		// System.out.printf("\n All products with price > :%s", price);

		Bson filter = Filters.gte("price", price);
		productsCollection.find(filter).forEach(doc -> System.out.println(doc.toJson()));
	}
	
	private static void deleteByNameStarting(String text) {
		Bson filter = Filters.regex("name", "^"+text, "i"); // "^" is regex match for starting with. 
		// Use "$" at the end for EndsWith match.  like text+"$"
		
		productsCollection.deleteMany(filter);		
	}
	

}
