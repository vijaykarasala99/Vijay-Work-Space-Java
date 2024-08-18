package com.vijay.exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ThrowsExample {
    public static void main(String[] args) {
       
    	try {
            writeToFile("example.txt", "Hello, World!");
        } catch (FileNotFoundException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
    static void writeToFile(String filename, String content) throws FileNotFoundException {
        File file = new File(filename);
        PrintWriter writer = new PrintWriter(file);
        writer.println(content);
        writer.close();
    }
}
