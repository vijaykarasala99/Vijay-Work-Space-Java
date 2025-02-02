package com.vijay.multithread;
public class CheckDaemonThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("Thread running..."));

        System.out.println("Is t1 a daemon thread? " + t1.isDaemon());

        t1.setDaemon(true);
        System.out.println("Is t1 a daemon thread now? " + t1.isDaemon());
    }
}
