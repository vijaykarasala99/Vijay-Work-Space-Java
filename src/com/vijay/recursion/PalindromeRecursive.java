package com.vijay.recursion;

public class PalindromeRecursive {
    public static void main(String[] args) {
        int number = 121;
        System.out.println(isPalindrome(number, number, 0) ? "Palindrome" : "Not Palindrome");
    }

    static boolean isPalindrome(int original, int num, int reversed) {
        if (num == 0) {
            return original == reversed;
        }
        return isPalindrome(original, num / 10, reversed * 10 + num % 10);
    }
}
