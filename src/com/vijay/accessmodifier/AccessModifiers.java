package com.vijay.accessmodifier;

public class AccessModifiers {
	private int privateField = 1;      // Only accessible within this class
	int defaultField = 2;              // Accessible within this package
	protected int protectedField = 3;  // Accessible within this package and subclasses
	public int publicField = 4;        // Accessible from anywhere

	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		System.out.println("Private Field: " + obj.privateField);
		System.out.println("Default Field: " + obj.defaultField);
		System.out.println("Protected Field: " + obj.protectedField);
		System.out.println("Public Field: " + obj.publicField);
	}
}
