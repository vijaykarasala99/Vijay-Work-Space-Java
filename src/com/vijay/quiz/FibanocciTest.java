package com.vijay.quiz;

public class FibanocciTest {
	
public static void main(String[] args) {
	int range =10;
	int a=0;
	int b=1;
	System.out.println(a);  
    System.out.println(b);  
    for (int i = 2; i < range; i++) {  // Start from 2 since first two numbers are already printed
        int c = a + b;                
        System.out.println(c);
        a = b;                         // Update a and b for the next iteration
        b = c;
    }
}
}
