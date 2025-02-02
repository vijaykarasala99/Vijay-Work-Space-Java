package com.vijay.ait;
public class RemoveCharacter {
    public static void main(String[] args) {
        String str = "Hello World";
        char ch = 'o';
        String result = str.replace(String.valueOf(ch), "");

        System.out.println("String after removing '" + ch + "': " + result);
    }
}
