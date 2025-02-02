package com.vijay.multithread;
class SharedResource {
    synchronized void printNumbers(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(n * i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SynchronizedMethodExample {
    public static void main(String[] args) {
        SharedResource obj = new SharedResource();
        
        Thread t1 = new Thread(() -> obj.printNumbers(5));
        Thread t2 = new Thread(() -> obj.printNumbers(10));
        
        t1.start();
        t2.start();
    }
}
