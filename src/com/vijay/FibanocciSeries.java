package com.vijay;
import java.util.Scanner;
public class FibanocciSeries {
public static void main(String[] args) {
//first two numbers in fibanocci series are 0,1 and next number is addition of previous two numbers
Scanner sc= new Scanner(System.in);
System.out.print("enter number: ");	
int n= sc.nextInt();
   
int a=0; int b=1;
System.out.print("Fibanocci Series Is:" +a+ "," +b  + ",");
for(int i=3;i<=n;i++) {
	int c=a+b;
	System.out.print(c +",");
	a=b;
	b=c;
	
}
}
}
