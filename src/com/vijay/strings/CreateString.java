package com.vijay.strings;

public class CreateString {

    public static void main(String[] args) {
        
        // 1. Using String literal
        String str1 = "Hello";
        
        // 2. Using 'new' keyword
        String str2 = new String("World");
        
        // 3. Using a character array
        char[] charArray = {'J', 'a', 'v', 'a'};
        String str3 = new String(charArray);
        
        // 4. Using StringBuilder
        StringBuilder sb = new StringBuilder("StringBuilder");
        String str4 = sb.toString();
        
        // 5. Using StringBuffer
        StringBuffer sbf = new StringBuffer("StringBuffer");
        String str5 = sbf.toString();
        
        // 6. Using String.valueOf method
        int number = 100;
        String str6 = String.valueOf(number);
      
        // Output the created strings
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);
        System.out.println("String 4: " + str4);
        System.out.println("String 5: " + str5);
        System.out.println("String 6: " + str6);
    }
}
