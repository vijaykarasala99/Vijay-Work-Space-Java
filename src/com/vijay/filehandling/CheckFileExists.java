package com.vijay.filehandling;
import java.io.File;

public class CheckFileExists {
    public static void main(String[] args) {
        File file = new File("example.txt");
        if (file.exists()) {
            System.out.println("The file exists.");
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
