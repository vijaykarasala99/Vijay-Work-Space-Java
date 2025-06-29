package com.vijay.oops;

class ObjectClassDemo implements Cloneable {
    int id = 101;
    String name = "Vijay";

    public boolean equals(Object obj) {
        ObjectClassDemo o = (ObjectClassDemo) obj;
        return this.id == o.id && this.name.equals(o.name);
    }

    public int hashCode() {
        return id + name.hashCode();
    }

    public String toString() {
        return id + " - " + name;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    protected void finalize() {
        System.out.println("finalize() called");
    }

    public static void main(String[] args) throws Exception {
        ObjectClassDemo obj1 = new ObjectClassDemo();
        ObjectClassDemo obj2 = (ObjectClassDemo) obj1.clone();

        System.out.println("Equals: " + obj1.equals(obj2));
        System.out.println("HashCode: " + obj1.hashCode());
        System.out.println("ToString: " + obj1);
        System.out.println("Class: " + obj1.getClass().getName());
        System.out.println("Clone: " + obj2);

        Object lock = new Object();

        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("Waiting...");
                    lock.wait(500);
                    System.out.println("Resumed");
                } catch (Exception e) {}
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                lock.notify();
                System.out.println("Notified");
            }
        });

        t1.start();
        Thread.sleep(100);
        t2.start();

        obj1 = null;
        System.gc(); // finalize() may get called
    }
}
