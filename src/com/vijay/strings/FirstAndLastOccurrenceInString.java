package com.vijay.strings;

public class FirstAndLastOccurrenceInString {
    public static void main(String[] args) {
        String str = "hello world, welcome to java";
        char target = 'o';

        int first = -1, last = -1;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        System.out.println("First occurrence: " + first);
        System.out.println("Last occurrence: " + last);
    }
}
