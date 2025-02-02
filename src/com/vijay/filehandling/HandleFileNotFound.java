package com.vijay.filehandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HandleFileNotFound {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("nonexistent.txt"))) {
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
