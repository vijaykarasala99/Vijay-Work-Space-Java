package com.vijay.fileiostreams;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("example.txt");

		int ch;
		while ((ch = reader.read()) != -1) {
			System.out.print((char) ch); // convert int to char
		}
		reader.close();
	}
}
