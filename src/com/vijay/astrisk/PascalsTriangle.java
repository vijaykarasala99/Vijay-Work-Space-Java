package com.vijay.astrisk;
public class PascalsTriangle {

    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            int number = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / j;
            }
            System.out.println();
        }
    }
}
