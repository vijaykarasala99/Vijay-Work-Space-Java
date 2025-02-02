package com.vijay.strings;

import java.util.Stack;

public class StringReverseWithStack {
    public static void main(String[] args) {
        String input = "Hello, World!";
        System.out.println("Original String: " + input);
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        System.out.println("Reversed String: " + reversed);
    }
}
