package com.vijay.wrapper;

public class WrapperClasses {

    public static void main(String[] args) {
        // Wrapper classes are used for converting primitive data types into objects and vice versa.
        // They are useful when primitives need to be treated as objects, such as in collections (e.g., ArrayList<Integer>).

        // Boxing: Converting primitive to object
        int a = 10;
        Integer b1 = new Integer(a);        // Boxing using constructor (deprecated since Java 9)
        Integer b2 = Integer.valueOf(a);    // Boxing using valueOf (preferred)
		
        //check datatype using instaceof operator
        boolean result = b2 instanceof Object;
		System.out.println(result);
		
        // Unboxing: Converting Integer object to int primitive
        int u1 = b1.intValue(); // Explicit unboxing (usually unnecessary since Java 5)
        int u2 = b2.intValue();
		
        // Note: From Java 5 onwards, the compiler automatically handles boxing and unboxing.
        // This is called autoboxing and auto-unboxing.
        int ab = 10;
        Integer b = ab; // Autoboxing (primitive to wrapper)

        Integer un = 10;
        int bb = un; // Auto-unboxing (wrapper to primitive)

        // Parsing: Converting a String to a corresponding primitive type
        String s = "9966";
        int p = Integer.parseInt(s); // Parses the string to int

        // Output for verification (optional)
        System.out.println("Boxed Integer (b1): " + b1);
        System.out.println("Parsed int from String: " + p);
    }
}
