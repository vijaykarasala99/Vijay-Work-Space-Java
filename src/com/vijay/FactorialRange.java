package com.vijay;
import java.util.Scanner;

public class FactorialRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first value: ");
        int a = sc.nextInt();
        System.out.print("Enter second value: ");
        int b = sc.nextInt();
        
        for (int i = a; i <= b; i++) {  
            long f = 1;
            for (int j = 1; j <= i; j++) {  
                f *= j;
            }
            System.out.println("Factorial of " + i + " is: " + f);
        }
        sc.close();  
    }
}
