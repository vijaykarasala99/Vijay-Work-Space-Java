package com.vijay;
import java.util.Scanner;
public class PerfectNumber {

	public static void main(String[] args) {
// if sum of factors of a number expect that number is equal to that number is called perfect number
// ex: 6, 28, 496 etc..
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number: ");
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			System.out.println(n +" :perfect number");
		} else {
			System.out.println(n + ":not perfect");
		}
	}}
