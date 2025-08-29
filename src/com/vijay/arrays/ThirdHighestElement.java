package com.vijay.arrays;

public class ThirdHighestElement {

	public static void main(String[] args) {
		int[] arr = { 10, 66, 58, 47, 63, 98, 78 };
		
		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > first) {
				third = second;
				second = first;
				first = num;
			} else if (num > second && num < first) {
				third = second;
				second = num;
			} else if (num > third && num < second) {
				third = num;
			}
		}
		 System.out.println("Third largest: " + third);
	}
}


