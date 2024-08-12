package com.vijay.controlstatements;

public class EvenOdd {
	public static void main(String[] args) {
		
		int evencount = 0;
		int oddcount = 0;
		
		System.out.println("even numbers: ");
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				evencount++;
			}
		}
		System.out.println("even count: " + evencount);

		System.out.println("odd numbers: ");

		for (int j = 0; j <= 10; j++) {
			if (j % 2 != 0) {
				System.out.println(j);
				oddcount++;
			}
		}
		System.out.println("odd count: " + oddcount);
         
	}
}
