package com.vijay.strings;

import java.util.Arrays;

public class StringMaxLengthWord {

	public static void main(String[] args) {
		String s = "test java123 hihowareyou tarining";
        String arr[] = s.split(" ");

        System.out.println(Arrays.toString(arr));

        String fmax = "";
        String smax = "";

        for (int i = 0; i < arr.length; i++) {
            int length = arr[i].length();
            if (length > fmax.length()) {
                smax = fmax; 
                fmax = arr[i];
            } else if (length > smax.length() && length < fmax.length()) {
                smax = arr[i]; 
            }
        }

        System.out.println("============");
        System.out.println("Longest word:   "          + fmax);
        System.out.println("Second longestword:   "   + smax);
	}
}



