package com.vijay.filehandling;
import java.io.*;

public class CopyFile {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("example.txt");
             FileOutputStream fos = new FileOutputStream("copy.txt")) {
            int content;
            while ((content = fis.read()) != -1) {
                fos.write(content);
            }
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
