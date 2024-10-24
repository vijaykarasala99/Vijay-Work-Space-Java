package com.vijay.strings;

import java.util.Scanner;

public class RemoveACharacter {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        
        System.out.print("Enter a character you want to remove: ");
        char ch = sc.next().charAt(0);  
        
        // Remove the specified character from the string    
        String result = s.replace(Character.toString(ch), "");
        System.out.println("Resulting string: " + result);
        sc.close();
    }
}
