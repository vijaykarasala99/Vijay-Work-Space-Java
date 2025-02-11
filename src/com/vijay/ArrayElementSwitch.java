package com.vijay;
public class ArrayElementSwitch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        
       // switch (arr) { // ❌ Compilation Error: "Cannot switch on a value of type int[]"

        switch (arr[0]) { // ✅ Works because arr[0] is an int
            case 1:
                System.out.println("First element is 1");
                break;
            case 2:
                System.out.println("First element is 2");
                break;
            default:
                System.out.println("No match");
        }
    }
}
