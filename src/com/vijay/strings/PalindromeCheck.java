package com.vijay.strings;

public class PalindromeCheck {
    public static void main(String[] args) {
        String str = "RacecaR";
        String original = str.replaceAll("\\s+", "").toLowerCase();
        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        if (original.equals(reversed)) {
            System.out.println(str + " : is Palindrome");
        } else {
            System.out.println(str + " : is Not a Palindrome");
        }
    }
}
