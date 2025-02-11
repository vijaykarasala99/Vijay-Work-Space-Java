package com.vijay.arrays;

public class ArrayWithReferenceType {
	String name;

	ArrayWithReferenceType(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Name: " + name;
	}

	public static void main(String[] args) {
		ArrayWithReferenceType arr[] = { new ArrayWithReferenceType("vijay"), new ArrayWithReferenceType("harsha") };
		for (ArrayWithReferenceType a : arr) {
			System.out.println(a);
		}
	}
}
