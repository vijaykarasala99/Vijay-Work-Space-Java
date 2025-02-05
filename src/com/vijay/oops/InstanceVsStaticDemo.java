package com.vijay.oops;

public class InstanceVsStaticDemo {
 
 int instanceVariable = 10;  // Instance variable (unique for each object)
 static int staticVariable = 20; // Static variable (shared across all objects)

 // Instance method can access both instance and static variables
 public void instanceMethod() {
     System.out.println("Inside Instance Method:");
     System.out.println("Instance Variable: " + instanceVariable); // ✅ Allowed
     System.out.println("Static Variable: " + staticVariable); // ✅ Allowed
 }

 // Static method can only access static variables, not instance variables
 public static void staticMethod() {
	 
     System.out.println("Inside Static Method:");
     
     // System.out.println("Instance Variable: " + instanceVariable); ❌ Not Allowed (Needs an object)
     InstanceVsStaticDemo obj = new InstanceVsStaticDemo();
     System.out.println("Accessing Instance Variable via Object: " + obj.instanceVariable); // ✅ Allowed via object

     System.out.println("Static Variable: " + staticVariable); // ✅ Allowed (Static variables belong to class)
 }

 public static void main(String[] args) {
     // Creating two different objects
     InstanceVsStaticDemo obj1 = new InstanceVsStaticDemo();
     obj1.instanceVariable = 100;  // Only affects obj1's instance variable

     InstanceVsStaticDemo obj2 = new InstanceVsStaticDemo();
     obj2.instanceVariable = 500;  // Only affects obj2's instance variable

     // Modifying the static variable through different ways
     obj1.staticVariable = 200; // Changing static variable (affects all objects)
     obj2.staticVariable = 500; // Again modifying static variable
     InstanceVsStaticDemo.staticVariable = 1000; // Best practice: Modify static variable using class name

     // Displaying instance variable values
     System.out.println("Instance Variable (obj1): " + obj1.instanceVariable); // 100
     System.out.println("Instance Variable (obj2): " + obj2.instanceVariable); // 500

     // Displaying static variable values (same for all objects)
     System.out.println("Static Variable (obj1): " + obj1.staticVariable); // 1000
     System.out.println("Static Variable (obj2): " + obj2.staticVariable); // 1000

     // Calling instance and static methods
     obj1.instanceMethod(); // Instance method can access both instance & static vars
     staticMethod(); // Static method accessing static variable
 }
}
