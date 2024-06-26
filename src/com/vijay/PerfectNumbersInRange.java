package com.vijay;

import java.util.Scanner;

public class PerfectNumbersInRange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter lower bound: ");
		int a = sc.nextInt();
		System.out.print("enter upper bound: ");
		int b = sc.nextInt();
		
		for (int i = a; i <= b; i++) {
			int sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum = sum + j;
				}
			}
			if (sum == i && i>1) {
		    System.out.println(i);
			}
		}
}}
