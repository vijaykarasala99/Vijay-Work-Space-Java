package com.vijay;

import java.util.Scanner;

public class Recursion {
    public static long factorial(int n) {
        if (n < 0) {
            System.out.println("Enter a valid non-negative number...");
            return -1;
        }else if (n == 0 || n == 1) {
           return 1; 
        }
         return n * factorial(n - 1);
  }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Factorial of " + n + " is: " + factorial(n));
        sc.close();
    }
}
