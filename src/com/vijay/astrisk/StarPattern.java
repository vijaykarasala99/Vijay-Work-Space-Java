package com.vijay.astrisk;
public class StarPattern {
    public static void main(String[] args) {
        int rows = 4; // Number of rows
        int columns = 5; // Number of columns

        // Outer loop for rows
        for (int i = 0; i < rows; i++) {
            // Inner loop for columns
            for (int j = 0; j < columns; j++) {
                System.out.print("* "); // Print a star followed by a space
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
