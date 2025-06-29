package com.vijay.fileiostreams;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		FileWriter writer = new FileWriter("example.txt");
		writer.write("Hello Mr.Vijay_Karasala");
		writer.append(" Congrats !!! ");
		writer.close();
		
		System.out.println("Successfully wrote to the file.");

	}
}
