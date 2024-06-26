package com.vijay;
import java.util.Scanner;
public class Practice {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	//leap year
	System.out.println("enter year");
	int year=sc.nextInt();
	
	if( (year%4==0 && year%100!=0 ) || year%400==0) {
		
		System.out.println("leap");
	}else {
		System.out.println("Not leap");	
	}
    
	
	//sum of n numbers
	int sum=0;
	for(int i=1; i<=year ; i++) {
		sum =sum+i;
	}
	System.out.println("sum of numbers till given number:"  +sum);
    sc.close();	
}

}