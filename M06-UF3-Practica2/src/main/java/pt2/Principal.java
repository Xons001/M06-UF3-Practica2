package pt2;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class Principal {

	public static void main(String[] args) {
		MongoClient mongo = crearConexion();
		MongoDatabase database = mongo.getDatabase("practica2");
		
		
	}
	
	public static MongoClient crearConexion() {
		System.out.println("Conexión MongoDB");
		MongoClientURI uri = new MongoClientURI("mongodb+srv://Xons001:1234@clusterprueba-7onhf.mongodb.net/test?retryWrites=true&w=majority");

		MongoClient mongoClient = new MongoClient(uri);
		return mongoClient;
	}
	
	
}
