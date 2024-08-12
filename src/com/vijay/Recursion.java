package com.vijay;

import java.util.Scanner;

public class Recursion {
    
    public static long factorial(int n) {
        if (n == 0 || n == 1) { 
            return 1;
        }
        return n * factorial(n - 1); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int i = sc.nextInt();
        System.out.println("Factorial of " + i + " is: " + factorial(i));
        sc.close();
    }
}
