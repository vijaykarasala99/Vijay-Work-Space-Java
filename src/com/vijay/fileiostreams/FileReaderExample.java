package com.vijay.fileiostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
	public static void main(String[] args) throws IOException {

		FileReader reader = new FileReader("example.txt");
		BufferedReader bufferedReader = new BufferedReader(reader);
		
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
		bufferedReader.close();
		reader.close();
	}
}

