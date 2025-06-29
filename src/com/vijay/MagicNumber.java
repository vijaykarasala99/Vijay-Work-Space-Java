package com.vijay;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int originalNumber = scanner.nextInt();
        int number = originalNumber;

        while (number > 9) {
            int sumOfDigits = 0;
            while (number != 0) {
                int digit = number % 10;
                number /= 10;
                sumOfDigits += digit;
            }
            number = sumOfDigits;
        }

        if (number == 1)
            System.out.println(originalNumber + " is a Magic Number");
        else
            System.out.println(originalNumber + " is not a Magic Number");

        scanner.close();
    }
}

