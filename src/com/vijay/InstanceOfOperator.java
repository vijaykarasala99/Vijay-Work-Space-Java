package com.vijay;

public class InstanceOfOperator {

	public static void main(String[] args) {
        
		//Note : primitives cannot be used with instanceof operator
		
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
