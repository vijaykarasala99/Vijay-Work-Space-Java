package com.vijay;

import java.util.Scanner;

public class ArmstrongNumberInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = sc.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + ":");

        for (int i = start; i <= end; i++) {
            int temp = i;
            int sum = 0;
            int length = String.valueOf(i).length();
            while (temp != 0) {
                int rem = temp % 10;
                sum += Math.pow(rem, length);
                temp = temp / 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}



