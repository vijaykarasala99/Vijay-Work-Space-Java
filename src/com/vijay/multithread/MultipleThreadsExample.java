package com.vijay.multithread;
public class MultipleThreadsExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            Thread t = new Thread(() -> System.out.println(Thread.currentThread().getName() + " is running"));
            t.start();
        }
    }
}
