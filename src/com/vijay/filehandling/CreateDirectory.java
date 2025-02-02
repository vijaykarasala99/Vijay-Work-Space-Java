package com.vijay.filehandling;
import java.io.File;

public class CreateDirectory {
    public static void main(String[] args) {
        File dir = new File("MyDirectory");
        if (dir.mkdir()) {
            System.out.println("Directory created.");
        } else {
            System.out.println("Directory already exists.");
        }
    }
}
