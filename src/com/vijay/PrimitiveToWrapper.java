package com.vijay;

public class PrimitiveToWrapper {

	public static void main(String[] args) {

		// Using Integer.valueOf() Method
		int a = 10;
		Integer b = Integer.valueOf(a);
		System.out.println(b);

		// Auto-boxing
		int c = 15;
		Integer d = c;
		System.out.println(d);
		
		 // Using Integer.intValue() Method
        Integer x = new Integer(5);
        int y = x.intValue();
        System.out.println(y);

        // Un-boxing
        Integer w = 10;
        int v = w;
        System.out.println(v);

	}

}
