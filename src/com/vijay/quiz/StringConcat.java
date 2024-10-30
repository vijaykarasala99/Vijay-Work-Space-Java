package com.vijay.quiz;

public class StringConcat {
	int i;
	static int a;

	public static void main(String[] args) {
		
		StringConcat sc = new StringConcat();

		System.out.println(sc.i);
		System.out.println(a);
		
		
		System.out.println("==================");
		
		System.out.println(10 + 20 + "vijay");
		System.out.println("vijay" + 10 + 20 + 10);
		System.out.println(10 + 20 + "vijay" + 10 + 20 + 10);
	}
}
