package com.vijay.filehandling;
import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("example.txt", true)) {
            writer.append("\nAppending new content.");
            System.out.println("Content appended successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
