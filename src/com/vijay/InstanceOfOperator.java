package com.vijay;

public class InstanceOfOperator {
	// It is a java keyword and used to test whether the given reference belongs to provided type or not. 
	// Type can be a class or interface. 
	// It returns either true or false.
	// Note : primitives cannot be used with instanceof operator
			
	public static void main(String[] args) {
		
		InstanceOfOperator ip = new InstanceOfOperator();

		System.out.println(ip instanceof InstanceOfOperator); // true
		System.out.println("=======================");
		String name = "vijay";
		System.out.println(name instanceof String); // true
		System.out.println("=======================");
		int arr[] = { 10, 20, 30 };
		System.out.println(arr instanceof int[]); // true

	}
}
