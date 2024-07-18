package com.vijay.accessmodifier;
public class AccessModifiers {
	
	private  int privateField;          // private Only accessible within this class
	int defaultField = 2;              // default Accessible within this package
	protected int protectedField = 3;  // protected Accessible within this package and subclasses
	public int publicField = 4;        // public Accessible from anywhere

	public static void main(String[] args) {
		
		AccessModifiers obj = new AccessModifiers();
		try {
			System.out.println("Private Field: " +obj.privateField);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Default Field: " + obj.defaultField);
		System.out.println("Protected Field: " + obj.protectedField);
		System.out.println("Public Field: " + obj.publicField);
	}
}
