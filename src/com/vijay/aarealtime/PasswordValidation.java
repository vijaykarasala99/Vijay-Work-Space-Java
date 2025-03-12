package com.vijay.aarealtime;

import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        String correctPassword = "Java123"; // Predefined password
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        if (enteredPassword.equals(correctPassword)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Error: Incorrect password.");
        }

        scanner.close();
    }
}
