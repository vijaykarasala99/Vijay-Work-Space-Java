package com.vijay;
import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        
        int largest = num1; // Assume num1 is the largest initially
        if (num2 > largest) {
            largest = num2; // If num2 is greater, update largest
        }
        if (num3 > largest) {
            largest = num3; // If num3 is greater, update largest 
        }
        System.out.println("The largest number is: " + largest);
    }
}

