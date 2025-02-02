package com.vijay.multithread;
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class SimpleThreadExample {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
