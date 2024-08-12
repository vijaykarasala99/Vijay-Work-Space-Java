package com.vijay.cloudgen;

public class Demo {
	int i;
	static int a;

	public static void main(String[] args) {
		Demo d = new Demo();

		System.out.println(d.i);
		System.out.println(a);
		System.out.println(10 + 20 + "cloudgen");
		System.out.println("cloudgen" + 10 + 20 + 10);
		System.out.println(10 + 20 + "cloudgen" + 10 + 20 + 10);
	}
}