package com.vijay.exceptions;
import java.io.IOException;

public class ExceptionPropagationExample {
// Exception propagation means passing the error from one method to another 
// until it's handled or the program stops.
    void methodA() throws IOException {
        methodB(); // Exception goes up to methodA
    }

    void methodB() throws IOException {
        methodC(); // Exception goes up to methodB
    }

    void methodC() throws IOException {
        throw new IOException("File not found"); // Exception starts here
    }

    public static void main(String[] args) {
        ExceptionPropagationExample obj = new ExceptionPropagationExample();
        try {
            obj.methodA(); // We catch the exception here
        } catch (IOException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
