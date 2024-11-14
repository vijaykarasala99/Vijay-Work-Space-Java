package com.vijay.memoryleaks;

import java.io.FileInputStream;
import java.io.IOException;

public class SafeFileReader {

    // Correct way to handle resources using try-with-resources
    public void readFileSafely() throws IOException {
        try (FileInputStream fis = new FileInputStream("C:\\springboot\\00_Prepare_Vijay\\user.ser")) {
            // Resource is automatically closed when exiting the try block
            // Perform file reading operations here
        } // fis.close() is called automatically
    }
    public static void main(String[] args) {
        SafeFileReader example = new SafeFileReader();
        try {
            example.readFileSafely(); // Properly handles file closing
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

