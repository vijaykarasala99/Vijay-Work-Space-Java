package com.vijay.arrays;
import java.util.Stack;

public class ReverseArrayWithStack {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        // Create a stack
        Stack<Integer> stack = new Stack<>();
        // Push all elements of the array onto the stack
        for (int num : array) {
            stack.push(num);
        }
        // Pop elements from the stack back into the array in reverse order
        for (int i = 0; i < array.length; i++) {
            array[i] = stack.pop();
        }
        System.out.println("\nReversed Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
