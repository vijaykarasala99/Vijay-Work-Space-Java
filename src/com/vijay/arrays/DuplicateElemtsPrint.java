package com.vijay.arrays;

public class DuplicateElemtsPrint {
	public static void main(String[] args) {
		int a[] = { 1, 2, 1, 2, 5, 4, 5};
		System.out.println("Duplicate Elemets: ");	
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println(a[i]);
				}
			}
		}
	}
}
