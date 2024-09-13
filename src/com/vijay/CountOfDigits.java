package com.vijay;

public class CountOfDigits {

	public static void main(String[] args) {
		int n = -1234560789; // Negative number example
		int count = 0;
		// Convert the number to positive to ignore the sign
		n = Math.abs(n);
		
		if (n == 0) {
			count = 1;
		} else {
			while (n != 0) {
				n = n / 10;
				count++;
			}
		}
		System.out.println(count);
	}
}
