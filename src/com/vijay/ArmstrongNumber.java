package com.vijay;

import java.util.Scanner;

public class ArmstrongNumber {

//sum of nth power of each digit equal to the number is called narcissistic number or armstrong
//	1-Digit Armstrong Numbers
//	Every single-digit number is an Armstrong number: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9
//	2-Digit Armstrong Numbers
//	There are no 2-digit Armstrong numbers.
//	3-Digit Armstrong Numbers
//	153 (1^3 + 5^3 + 3^3 = 153)
//	370 (3^3 + 7^3 + 0^3 = 370)
//	371 (3^3 + 7^3 + 1^3 = 371)
//	407 (4^3 + 0^3 + 7^3 = 407)

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
         
		int temp = n;
		int rem = 0;
		int sum = 0;
		int length = String.valueOf(n).length();
      
		while (n > 0) {
			rem = n % 10;
			sum += Math.pow(rem, length);
			n = n / 10;
		}
		
		if (sum == temp) {
			System.out.println(temp + " : is armstrong");
		} else {
			System.out.println(temp + " : Not armstrong");
		}
	}
}
