package com.vijay.filehandling;
import java.io.File;

public class ListFiles {
    public static void main(String[] args) {
        File dir = new File("MyDirectory");
        String[] files = dir.list();
        if (files != null) {
            for (String file : files) {
                System.out.println(file);
            }
        } else {
            System.out.println("Directory is empty or does not exist.");
        }
    }
}
