package com.vijay.strings;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter a string: ");
        String s1 = sc.nextLine();
        
//        for(int i=s1.length()-1;i>=0;i--) {
//        	System.out.print(s1.charAt(i) +" ");
//        }

        String s2="";
        for (int i = s1.length()-1; i >=0; i--) {
		           s2=s2+s1.charAt(i);
		}
        System.out.println(s2);
        sc.close();
    
    }
}





