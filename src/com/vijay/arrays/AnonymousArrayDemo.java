package com.vijay.arrays;

public class AnonymousArrayDemo {

	public static void main(String[] args) {
		// AnonymousArray does not have any reference it is passed directly to a method
		printNumbers(new int[] { 10, 20, 30 });
	}

	static void printNumbers(int[] numbers) {
		for (int num : numbers) {
			System.out.println(num);
		}
	}
}
