package com.vijay;

public class LabeledBreakDemo {

    public static void main(String[] args) {
        System.out.println("Example of Normal Break:");
        
        // Normal Break
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                    System.out.println("Breaking inner loop when j = " + j);
                    break; // Exits only the inner loop
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
        
        System.out.println("\n============================");
        System.out.println("\nExample of Labeled Break:");
        
        // Labeled Break
        outerloop:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                   System.out.println("Breaking outer loop when j = " + j);
                    break outerloop; // Exits the outer loop
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }

        System.out.println("Exited the loops.");
    }
}
