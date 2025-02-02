package com.vijay.filehandling;
import java.io.File;

public class CheckReadable {
    public static void main(String[] args) {
        File file = new File("example.txt");
        if (file.canRead()) {
            System.out.println("The file is readable.");
        } else {
            System.out.println("The file is not readable.");
        }
    }
}
