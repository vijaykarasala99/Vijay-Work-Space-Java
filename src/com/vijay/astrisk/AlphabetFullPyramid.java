package com.vijay.astrisk;

public class AlphabetFullPyramid {
    public static void main(String[] args) {
        int n = 5; // Total number of rows for the upper half

        // Upper Half
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // Print increasing letters
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j));
            }

            // Print decreasing letters
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char)('A' + j));
            }
            System.out.println();
        }

        // Lower Half
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces
            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }

            // Print increasing letters
            for (int j = 0; j < i; j++) {
                System.out.print((char)('A' + j));
            }

            // Print decreasing letters
            for (int j = i - 2; j >= 0; j--) {
                System.out.print((char)('A' + j));
            }

            System.out.println();
        }
    }
}
