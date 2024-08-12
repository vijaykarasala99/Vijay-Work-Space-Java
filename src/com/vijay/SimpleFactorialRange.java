package com.vijay;
import java.util.Scanner;

public class SimpleFactorialRange {

    // Recursive method to calculate factorial
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    } 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input the range
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt(); 
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        // Calculate and print factorials for each number in the range
        for (int i = start; i <= end; i++) {
            System.out.println("Factorial of " + i + " = " + factorial(i));
        }

        scanner.close();
    }
}
