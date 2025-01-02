package com.vijay;

public class Increment{

	public static void main(String[] args) {
	int x=30;
	x++;
	System.out.println(x++);
	++x;
	System.out.println(x);
	
	   int a = 10;
       int b = a++;  // Postfix: b is assigned 10, then a is incremented to 11
       System.out.println("a: " + a); // Output: a: 11
       System.out.println("b: " + b); // Output: b: 10

       int c = 10;
       int d = ++c;  // Prefix: c is incremented to 11, then d is assigned 11
       System.out.println("c: " + c); // Output: c: 11
       System.out.println("d: " + d); // Output: d: 11
}
}
