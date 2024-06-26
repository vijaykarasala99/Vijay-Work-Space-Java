package com.vijay;

public class Person {
	// instance variables
	private String name;
	private int age;
	private String email;

	public Person() {
		super();
		
	}
	// Constructor with parameters
	public Person(String name, int age, String email) {
		//this keyword refres current instance of object within a class
		//this helps avoid naming conflicts between instance variables and parameters
		this.name = name;
		this.age = age;
		this.email = email;
	}
	// Display method to print information about the person
	public void displayInfo() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
	System.out.println("Email: " + email);
	}
    //main method is entry point of program execution
	public static void main(String[] args) {
		// Creating objects using the constructor
		// order also mandatory when we passing parameters
		Person p = new Person("John", 1, "john@example.com");

		// Accessing object state and displaying information
		System.out.println("Information for Person 1:");
		p.displayInfo();

	}
}