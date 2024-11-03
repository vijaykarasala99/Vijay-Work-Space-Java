package com.vijay.accessmodifier;

public class AccessModifiers {

	public int publicField = 1; // public Accessible from anywhere
	protected int protectedField = 3; // protected Accessible within this package and subclasses even if different package
	int defaultField = 2; // default Accessible within this package
	private int privateField; // private Only accessible within this class

	public static void main(String[] args) {

		AccessModifiers obj = new AccessModifiers();
		System.out.println("Public Field: " + obj.publicField);
		System.out.println("Protected Field: " + obj.protectedField);
		System.out.println("Default Field: " + obj.defaultField);
		System.out.println("Private Field: " + obj.privateField);

	}
}
