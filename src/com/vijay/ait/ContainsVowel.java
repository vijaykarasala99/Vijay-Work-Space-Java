package com.vijay.ait;
public class ContainsVowel {
    public static void main(String[] args) {
        String str = "hello";
        boolean containsVowel = str.matches(".*[aeiouAEIOU].*");

        System.out.println("Contains vowels? " + containsVowel);
    }
}
