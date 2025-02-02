package com.vijay.multithread;
class Resource1 {
    synchronized void method1(Resource2 r2) {
        System.out.println("Thread1: Locked Resource1");
        try { Thread.sleep(100); } catch (Exception e) {}
        r2.method2();
    }
    
    synchronized void method2() {
        System.out.println("Thread1: Accessed Resource1");
    }
}

class Resource2 {
    synchronized void method1(Resource1 r1) {
        System.out.println("Thread2: Locked Resource2");
        try { Thread.sleep(100); } catch (Exception e) {}
        r1.method2();
    }
    
    synchronized void method2() {
        System.out.println("Thread2: Accessed Resource2");
    }
}

public class DeadlockResolvedExample {
    public static void main(String[] args) {
        Resource1 r1 = new Resource1();
        Resource2 r2 = new Resource2();
        
        new Thread(() -> r1.method1(r2)).start();
        new Thread(() -> r2.method1(r1)).start();
    }
}
