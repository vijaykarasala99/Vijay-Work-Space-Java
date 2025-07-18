package com.vijay.recursion;

public class ReverseNumberRecursion {
	static int reverse(int num, int rev) {
		if (num == 0)
			return rev;
		return reverse(num / 10, rev * 10 + num % 10);
	}

	public static void main(String[] args) {
		int number = 12345;
		int reversed = reverse(number, 0);
		System.out.println("Reversed number: " + reversed);
	}
}