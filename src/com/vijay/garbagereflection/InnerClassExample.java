package com.vijay.garbagereflection;
class OuterClass {
    int outerVar = 10;

    class InnerClass {
        void display() {
            System.out.println("Outer Variable: " + outerVar);
        }
    }
}

public class InnerClassExample {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();
    }
}
