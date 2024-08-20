package com.vijay.collections;
import java.util.Stack;

public class StackExample {
	
    public static void main(String[] args) {
        //Stack is a child class of Vector class, it uses a mechanism called LIFO(last inserted deleted first)
    	//Note: if you want to follow LIFO mechanism use stack methods only
    	
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        // Display the stack
        System.out.println("original stack: " + stack);
        System.out.println();
        // Use add method (inherits from Vector)
        stack.add(60);
        System.out.println("Stack after add method: " + stack);

        // Use remove method (inherits from Vector)
        stack.remove(Integer.valueOf(20));
        System.out.println("Stack after remove method: " + stack);

        // Peek at the top element without removing it
        System.out.println("Top element (peek): " + stack.peek());
       
        // Pop removes top element from the stack
        System.out.println("Element removed (pop): " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Search for an element in the stack
        int element = 30;
        int position = stack.search(element);
        if (position != -1) {
            System.out.println("Element " + element + " found at position: " + position);
        } else {
            System.out.println("Element " + element + " not found in the stack.");
        }
        // Clear the stack
        stack.clear();
        System.out.println("Stack after clearing: " + stack);
    }
}
