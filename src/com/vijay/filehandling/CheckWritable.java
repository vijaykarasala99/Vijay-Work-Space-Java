package com.vijay.filehandling;
import java.io.File;

public class CheckWritable {
    public static void main(String[] args) {
        File file = new File("example.txt");
        if (file.canWrite()) {
            System.out.println("The file is writable.");
        } else {
            System.out.println("The file is not writable.");
        }
    }
}

