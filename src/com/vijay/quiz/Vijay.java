package com.vijay.quiz;

class A{
	int a=1;
	int b=2;
}
class B extends A{
	int c=3;
	int d=4;
}


public class Vijay {
	public static void main(String[] args) {
		A a= new B();
		System.out.println(a.a);
		System.out.println(a.b);
		B b=(B) a;
		System.out.println(b.c);
		System.out.println(b.d);
	}
}
