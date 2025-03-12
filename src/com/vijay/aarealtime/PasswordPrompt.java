package com.vijay.aarealtime;

import java.util.Scanner;

public class PasswordPrompt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.print("Set a strong password (at least 6 characters): ");
            password = scanner.nextLine();
        } while (password.length() < 6);

        System.out.println("Password set successfully!");
        scanner.close();
    }
}
