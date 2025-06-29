package com.vijay.arrays;
import java.util.Stack;

public class ReverseArrayWithStack {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
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
        System.out.println("Reversed Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

