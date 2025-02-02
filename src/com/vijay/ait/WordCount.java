package com.vijay.ait;
public class WordCount {
    public static void main(String[] args) {
        String str = "Hello world, welcome to Java";
        String[] words = str.split("\\s+"); 
        System.out.println("Number of words: " + words.length);
    }
}
