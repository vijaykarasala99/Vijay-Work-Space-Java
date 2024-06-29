package com.vijay.generics;

//A generic class with a type parameter T
class Box<T> {
	
 private T item;

 public void setItem(T item) {
     this.item = item;
 }

 public T getItem() {
     return item;
 }
}

public class Main {
	
 public static void main(String[] args) {
     // Create a Box to hold an Integer
     Box<Integer> integerBox = new Box<>();
     integerBox.setItem(123);
     System.out.println("Integer Value: " + integerBox.getItem());

     // Create a Box to hold a String
     Box<String> stringBox = new Box<>();
     stringBox.setItem("Hello Generics");
     System.out.println("String Value: " + stringBox.getItem());
 }
}



