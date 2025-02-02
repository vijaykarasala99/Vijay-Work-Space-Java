package com.vijay.exception;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFound {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistent.txt");
            Scanner sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
        }
    }
}
