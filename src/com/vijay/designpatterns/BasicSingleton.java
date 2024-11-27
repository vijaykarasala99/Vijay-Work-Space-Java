package com.vijay.designpatterns;

public class BasicSingleton {
// The Singleton pattern ensures a class has only one instance, providing a global point of access to it.
// It’s commonly used for shared resources like database connections, logging, and configuration settings,
// where multiple instances would be inefficient or cause inconsistencies.
	
	private static BasicSingleton instance;

	// Private constructor prevents instantiation from other classes
	private BasicSingleton() {
	}
 
	//Synchronized method to control simultaneous access
	public static synchronized BasicSingleton getInstance() {
		if (instance == null) {
			instance = new BasicSingleton();
		}
		return instance;
	}

   public static void main(String[] args) {
// Directly call the getInstance method without creating an instance of BasicSingleton
		BasicSingleton instance1 = BasicSingleton.getInstance();
		BasicSingleton instance2 = BasicSingleton.getInstance();
		
		// Check if both references point to the same instance
		if (instance1 == instance2) {
			System.out.println("Both references point to the same instance. Singleton verified!");
		} else {
			System.out.println("Instances are different. Singleton not implemented correctly.");
		}
	}
}  



