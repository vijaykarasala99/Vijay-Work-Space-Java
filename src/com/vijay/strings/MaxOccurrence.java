package com.vijay.strings;

public class MaxOccurrence {

	public static void main(String[] args) {
		String str = "vijayaya";
        int max = 1;
        int count = 1;
        char ch = str.charAt(0);

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
                if (count > max) {
                    max = count;
                    ch = str.charAt(i);
                }
            } else {
                count = 1;
            }
        }

        System.out.println(ch);
        System.out.println(max);
	}
}