package com.vijay.ait;
public class AsciiValues {
    public static void main(String[] args) {
        String str = "Hello";
      
        for (char ch : str.toCharArray()) {
            System.out.println(ch + " : " + (int) ch);
        }
    }
}
