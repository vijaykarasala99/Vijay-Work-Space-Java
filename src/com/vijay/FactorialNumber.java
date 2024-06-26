package com.vijay;

import java.util.Scanner;

public class FactorialNumber {
//factorial of a number is product of all positive descending integers
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.print("enter number: ");
	int n =sc.nextInt();
	
	int factorial=1;
	for(int i=1;i<=n;i++) {
		factorial=factorial*i;
	   }
	System.out.println("Factorial of, " +n+ " is : " +factorial);
	}
}
