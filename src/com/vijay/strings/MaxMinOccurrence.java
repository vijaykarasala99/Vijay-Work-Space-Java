package com.vijay.strings;

public class MaxMinOccurrence {

    public static void main(String[] args) {
       
    	String str = "vijayaya";
       
        int maxCount = 0;
        int minCount = str.length();
        char maxChar = ' ';
        char minChar = ' ';

        // Loop to find the max and min occurrences
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            // Count occurrences of str.charAt(i)
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            // Update max character
            if (count > maxCount) {
                maxCount = count;
                maxChar = str.charAt(i);
            }
            // Update min character only if it appears more than once
            if (count < minCount && count > 1) {
                minCount = count;
                minChar = str.charAt(i);
            }
        }
        // Print results
        System.out.println("Character with maximum occurrence: " + maxChar);
        System.out.println("Maximum occurrence count: " + maxCount);
        System.out.println("Character with minimum occurrence: " + minChar);
        System.out.println("Minimum occurrence count: " + minCount);
}}
