package com.vijay;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number:");
		double number = sc.nextDouble();
		int i = (int) number;
	
		String binary = Integer.toBinaryString(i);
		System.out.println("Binary representation: " + binary);		
		sc.close();
	}
}
