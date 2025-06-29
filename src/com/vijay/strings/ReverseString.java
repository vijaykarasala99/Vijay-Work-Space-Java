package com.vijay.strings;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter a string: ");
        String s1 = sc.nextLine();
        String s2="";
        for (int i = s1.length()-1; i >=0; i--) {
        	      char ch = s1.charAt(i);
		           s2+=ch;
		}
        System.out.println(s2);
        sc.close();
//      for(int i=s1.length()-1;i>=0;i--) {
//    	System.out.print(s1.charAt(i) +" ");
//    }
    }
}





