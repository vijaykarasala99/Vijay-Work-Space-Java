package com.vijay.astrisk;

public class PatternWith7Reverse {
	public static void main(String[] args) {

		for (int i = 7; i >= 1; i--) {
			for (int j = 7; j >= 8 - i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}
}