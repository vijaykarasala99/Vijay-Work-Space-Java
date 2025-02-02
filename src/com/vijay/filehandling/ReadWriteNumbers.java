package com.vijay.filehandling;
import java.io.*;

public class ReadWriteNumbers {
    public static void main(String[] args) {
        String fileName = "numbers.txt";

        // Writing numbers
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(42);
            dos.writeDouble(3.14);
            dos.writeLong(100000L);
            System.out.println("Numbers written successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading numbers
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            System.out.println("Integer: " + dis.readInt());
            System.out.println("Double: " + dis.readDouble());
            System.out.println("Long: " + dis.readLong());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
