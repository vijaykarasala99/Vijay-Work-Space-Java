package com.vijay;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class ReadingDataFromUser {
	
	public static void main(String[] args) throws IOException {
		//we can read data from user in many ways in java
		//by using BufferedReader(java.io package)
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 System.out.print("Enter something: ");
		 String input = reader.readLine();
	
         System.out.println(input);
         
        //by using Scanner class which is in java.util package
		Scanner sc= new Scanner(System.in);
		System.out.print("enter name: ");
		String s = sc.nextLine();
		System.out.println(s);
		   
	}
}