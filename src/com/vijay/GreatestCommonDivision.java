package com.vijay;
import java.util.Scanner;
public class GreatestCommonDivision {
	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("enter first number: ");
	int a= sc.nextInt();
	System.out.print("enter second number: ");
    int b= sc.nextInt();
	int gcd=1;
	for(int i=2; i<=a&&i<=b; i++) {
	if(a%i==0&&b%i==0) {
		gcd=i;
	   }
	}
	System.out.println("GCD OF: " +a+ "," +b+ "is:  " +gcd);
}
}
