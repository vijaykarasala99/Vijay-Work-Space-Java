package com.vijay.strings;
import java.util.Scanner;

public class StringContains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = sc.nextLine();

        if (str2.contains(str1)) {
            System.out.println("The first string is present in the second string.");
        } else if (str1.contains(str2)) {
            System.out.println("The second string is present in the first string.");
        } else {
            System.out.println("Neither string is present in the other.");
        }
    }
}
