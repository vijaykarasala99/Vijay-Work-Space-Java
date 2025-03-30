package com.vijay;

public class TrickyJavaExamples {
    public static void main(String[] args) {
        // 1) Character to Integer Confusion
        char ch = 'A' + 1;  
        System.out.println("1) Character to Integer Confusion: " + ch); // Output: B
        System.out.println("\n---------------------\n");

        // 2) Unicode Character Assignment
        char smiley = '\u263A'; // Unicode for ☺
        System.out.println("2) Unicode Character Assignment: " + smiley); // Output: ☺
        System.out.println("\n---------------------\n");

        // 3) Array with Mixed Data Types
        Object arr[] = {1, 'A', "Hello", 3.14};
        System.out.println("3) Array with Mixed Data Types:");
        for (Object obj : arr) {
            System.out.println(obj + " -> " + obj.getClass().getSimpleName());
        }
        System.out.println("\n---------------------\n");

        // 4) Tricky Integer Comparison
        Integer a = 127;
        Integer b = 127;
        System.out.println("4) Integer Comparison:");
        System.out.println("127 == 127: " + (a == b)); // true

        Integer x = 128;
        Integer y = 128;
        System.out.println("128 == 128: " + (x == y)); // false
        System.out.println("\n---------------------\n");

        // 5) Tricky String Immutability
        String s1 = "Java";
        String s2 = "Ja" + "va";
        System.out.println("5) String Immutability:");
        System.out.println("s1 == s2: " + (s1 == s2)); // true

        String s3 = "Ja";
        String s4 = s3 + "va";
        System.out.println("s1 == s4: " + (s1 == s4)); // false
        System.out.println("\n---------------------\n");

        //Another in Strings
        String str = "HelloWorld";
        String sub1 = str.substring(0, 5); // "Hello"
        String sub2 = "Hello";
        System.out.println(sub1 == sub2); // false (different objects in memory)

        String sub3 = str.substring(0, 5).intern();
        System.out.println(sub3 == sub2); // true (interned, same reference)

        
        // 6) Integer Overflow Trick
        int max = Integer.MAX_VALUE;  
        System.out.println("6) Integer Overflow:");
        System.out.println("Integer.MAX_VALUE + 1: " + (max + 1)); // -2147483648
        System.out.println("\n---------------------\n");

        // 7) Boolean Trick
        Boolean bool1 = true;
        Boolean bool2 = new Boolean(true);
        System.out.println("7) Boolean Comparison:");
        System.out.println("bool1 == bool2: " + (bool1 == bool2)); // false
        System.out.println("\n---------------------\n");

        // 8) Tricky Final Variable
        final int finalVar;
        finalVar = 10; // First-time assignment is allowed
        System.out.println("8) Final Variable:");
        System.out.println("Final variable value: " + finalVar); // Output: 10
        System.out.println("\n---------------------\n");
    }
}
