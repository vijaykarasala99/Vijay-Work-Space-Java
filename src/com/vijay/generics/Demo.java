package com.vijay.generics;

public class Demo<T> {
	
	private T item;

	public void setItem(T item) {
		this.item = item;
	}

	public T getItem() {
		return item;

	}

	public static void main(String[] args) {
		Demo<Integer> demo = new Demo<>();
		demo.setItem(1);
		System.out.println(demo.getItem());
		Demo<String> demoobj = new Demo<>();
		demoobj.setItem("vijay");
		System.out.println(demoobj.getItem());

	}

}
