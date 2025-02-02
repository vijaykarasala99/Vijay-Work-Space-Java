package com.vijay.filehandling;
import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File oldFile = new File("example.txt");
        File newFile = new File("newExample.txt");
        if (oldFile.renameTo(newFile)) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Failed to rename file.");
        }
    }
}

