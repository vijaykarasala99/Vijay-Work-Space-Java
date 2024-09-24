package com.vijay.arrays;

import java.util.Arrays;

public class MissingNumber {
	public static void main(String[] args) {
		int a[] = { 1, 8, 4, 6 };
		int temp = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Missing numbers: ");
		for (int i = 0; i < a.length-1; i++) {
			int k=a[i]+1;   
			while(k<a[i+1]) { 
				System.out.println(k);
				k++;
			}
		}
}}

