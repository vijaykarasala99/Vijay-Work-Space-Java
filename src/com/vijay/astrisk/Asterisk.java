package com.vijay.astrisk;

import java.util.Scanner;

public class Asterisk {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.print("enter rows: ");
	int rows=sc.nextInt();
    
	     for(int i=1;i<=rows;i++) {
    	 for(int j=1;j<=i;j++) {
    		 System.out.print("*");
    	 }
		 System.out.println();
     }
	     
System.out.println("====== For Reverse ======");
for(int i=rows;i>=1;i--) {
for(int j=1;j<=i;j++) {
	System.out.print("*");
}
System.out.println();
}


System.out.println("===== For Numbers =======");
for(int i=1;i<=rows;i++) {
for (int j=1;j<=i;j++) {
	System.out.print(j);
}
System.out.println();
}
}}








