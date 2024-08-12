package com.vijay;

public class SwitchExample {
public static void main(String[] args) {
	String a="hlo";
	
	switch(a) {
	default:
		System.out.println("vijay");
	}
}
}


//on which data types can be the variable 'a' be?

//  In Java, you cannot use  long, float, double, or boolean   data types directly in a switch statement. The switch statement only supports int, byte, short, char, String, and enum types. Here's why these types are not supported:
//	long: The long type has a much larger range than int, and allowing long in a switch could lead to performance issues and complexity in the implementation of the switch mechanism.
//	float and double: These are floating-point types and are not precise, which makes them unsuitable for switch cases that require exact matches.
//	boolean: Since a boolean can only have two possible values (true or false), using a switch statement is not necessary and is better handled by an if-else statement.
//  To handle these types, you need to use if-else statements
