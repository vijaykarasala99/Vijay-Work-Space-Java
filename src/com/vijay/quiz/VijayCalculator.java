package com.vijay.quiz;

import java.util.Scanner;

public class VijayCalculator {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
		double n1 = sc.nextDouble();
		System.out.print("Enter second number: ");
		double n2 = sc.nextDouble();
		System.out.print("Enter Operations Like + - * / % :   ");
		char operation = sc.next().charAt(0);

		double result;
		switch (operation) {
		case '+':
			result = n1 + n2;
			break;
		case '-':
			result = n1 - n2;
			break;
		case '*':
			result = n1 * n2;
			break;
		case '/':
			result = n1 / n2;
			break;
		case '%':
			result = n1 % n2;
			break;
		default:
			throw new IllegalArgumentException("Invalid Operation");
		}
		System.out.println("Result: " + result);
		sc.close();
	}
}
