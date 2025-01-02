package com.vijay;

public class NestedIfExample {
    public static void main(String[] args) {
        String username = "admin";
        String password = "password123";
        String role = "Admin";

        if (username.equals("admin")) { // Outer condition: Check username
            if (password.equals("password123")) { // Inner condition: Check password
                if (role.equals("Admin")) { // Another nested condition: Check role
                    System.out.println("Welcome, Admin! You have full access.");
                } else {
                    System.out.println("Welcome! You have limited access.");
                }
            } else {
                System.out.println("Incorrect password.");
            }
        } else {
            System.out.println("Invalid username.");
        }
    }
}

