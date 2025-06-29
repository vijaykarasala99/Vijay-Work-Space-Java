package com.vijay;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter a number:");
		double number = sc.nextDouble();
		int i = (int) number;
		
		//Here In Long There Is A Method Long.toBinaryString
		long longValue=12546897;
		String binary1=Long.toBinaryString(longValue);
		
		//Here In Long There Is A Method Integer.toBinaryString
		String binary2 = Integer.toBinaryString(i);
		
		System.out.println("Binary representation: " + binary1);		
		System.out.println("Binary representation: " + binary2);		
		
	}
}


