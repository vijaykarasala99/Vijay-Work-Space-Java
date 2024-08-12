package com.vijay.controlstatements;

public class OneToHundredWhile {

	public static void main(String[] args) {
	   int i=0;
	   //zero to hundred
		while(i<=100) {
			System.out.println(i);
			i++;
		}
		System.out.println(" hundred to zero ");
		int y=100;
		while(y>=0) {
			System.out.println(y);
			y--;
		}
		
		System.out.println("using do while - hundred to zero ");
		
		int a=100;
        do {
        	System.out.println(a);
        	a--;
           }while(a>=0);
		
        System.out.println("using for - zero to hundred");
		for(int b=0;b<=100;b++) {
			System.out.println(b);
		}
  
	}
}



