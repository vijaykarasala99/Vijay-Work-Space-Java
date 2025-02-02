package com.vijay.multithread;
class Resource {
    void printNumbers(int n) {
        synchronized (this) {
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
}

public class SynchronizedBlockExample {
    public static void main(String[] args) {
        Resource obj = new Resource();
        
        Thread t1 = new Thread(() -> obj.printNumbers(5));
        Thread t2 = new Thread(() -> obj.printNumbers(10));
        
        t1.start();
        t2.start();
    }
}
