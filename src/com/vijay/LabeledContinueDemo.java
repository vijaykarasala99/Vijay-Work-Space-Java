package com.vijay;

public class LabeledContinueDemo {

    public static void main(String[] args) {
        System.out.println("Example of Normal Continue:");
        
        // Normal Continue
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                   System.out.println("Skipping j = " + j + " in the inner loop.");
                    continue; // Skips the rest of the current iteration of the inner loop
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
       
        System.out.println("\n=====================================");
        System.out.println("\nExample of: ======>  Labeled Continue:");
        
        // Labeled Continue
        outerloop:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 1) {
                   // System.out.println("Skipping i = " + i + " when j = " + j);
                    continue outerloop; // Skips to the next iteration of the outer loop
                }
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}


