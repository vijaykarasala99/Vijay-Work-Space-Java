package com.vijay.arrays;

public class ArrayWithDifferentDatatypes {
	public static void main(String[] args) {
        // Initialize an integer array
        int arr[];
        arr = new int[]{1, 2, 3}; // Assigning values directly to the array

        // Object array can hold heterogeneous types
        Object[] objArray = new Object[10];
        Object[] objArray2 = {1, "hlo", 'F'}; // Mixed types: Integer, String, Character
        objArray[0] = 1; // Storing an Integer
        objArray[1] = "hlo"; // Storing a String
        objArray[2] = 'C'; // Storing a Character

        // Access and print values from the object arrays
        System.out.println(objArray2[2]); // Outputs: F
        System.out.println(objArray[2]);  // Outputs: C

        // String array initialization and assignment
        String ar[] = new String[2];
        ar[0]="hlo";
        System.out.println(ar[0] = ("Helo")); // Assigning and printing a value

        // Initializing a StringBuffer array
        StringBuffer[] bufferArray = new StringBuffer[2];
        bufferArray[0] = new StringBuffer("klo"); // Initializing StringBuffer objects
        bufferArray[1] = new StringBuffer("world");

        // Modifying the content of a StringBuffer
        bufferArray[0].append(" modified"); // Appending to the first buffer
        System.out.println(bufferArray[0]); // Outputs: klo modified

        // Creating a StringBuffer array without initialization
        StringBuffer[] b = new StringBuffer[5];
        System.out.println(b[4]); // Outputs: null (default value for uninitialized references)

        // Correct way to initialize a StringBuffer array
        //StringBuffer[] b1 = {"h","hello"}; // Compile-time error (requires explicit objects)
        StringBuffer[] b2 = {new StringBuffer("h"), new StringBuffer("hello")};

        System.out.println("======> " + b2); // Outputs the reference of the array

        // Assigning values to the previously created StringBuffer array
        b[0] = new StringBuffer("Hello");
        b[1] = new StringBuffer("World");
        b[2] = new StringBuffer("Java");
        b[3] = new StringBuffer("Programming");
        b[4] = new StringBuffer("Language");

        // Iterating and printing all values of the StringBuffer array
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]); // Outputs each StringBuffer value
        }

        // Access and print a specific value from the integer array
        System.out.println(arr[1]); // Outputs: 2

        // Initializing a wrapper class Integer array
        Integer wrapintarr[] = new Integer[5];
        wrapintarr[0] = 10; // Assigning values to the array
        wrapintarr[1] = 20;
       
        // Iterating and printing values of the Integer array
        for (Integer num : arr) {
            System.out.println(num); // Outputs each value in the array
        }
    }
}
