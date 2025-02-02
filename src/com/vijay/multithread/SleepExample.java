package com.vijay.multithread;
public class SleepExample {
    public static void main(String[] args) {
        try {
            System.out.println("Thread will sleep for 2 seconds...");
            Thread.sleep(2000);
            System.out.println("Thread awake after sleep!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
