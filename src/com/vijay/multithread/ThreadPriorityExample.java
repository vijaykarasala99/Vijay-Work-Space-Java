package com.vijay.multithread;
public class ThreadPriorityExample {
    public static void main(String[] args) {
        Thread lowPriority = new Thread(() -> System.out.println("Low priority thread running..."));
        Thread highPriority = new Thread(() -> System.out.println("High priority thread running..."));
        
        lowPriority.setPriority(Thread.MIN_PRIORITY);
        highPriority.setPriority(Thread.MAX_PRIORITY);
        
        lowPriority.start();
        highPriority.start();
    }
}
