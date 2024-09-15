package com.vijay.operators;

public class TernaryOperator {

	public static void main(String[] args) {
		// ternary operator in Java is a concise way to write an if-else statement. It
		// is used to make decisions in a single line, based on a condition
		// syntax: condition ? expressionIfTrue : expressionIfFalse;

		int age = 18;
		String result = (age >= 18) ? "Adult" : "Minor";
		System.out.println(result);  //Op: Adult
		
	}
}
