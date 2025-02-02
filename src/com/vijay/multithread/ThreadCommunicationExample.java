package com.vijay.multithread;
class SharedData {
    private boolean isAvailable = false;

    synchronized void produce() {
        try {
            while (isAvailable) wait();
            System.out.println("Produced Item");
            isAvailable = true;
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    synchronized void consume() {
        try {
            while (!isAvailable) wait();
            System.out.println("Consumed Item");
            isAvailable = false;
            notify();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadCommunicationExample {
    public static void main(String[] args) {
        SharedData data = new SharedData();

        new Thread(data::produce).start();
        new Thread(data::consume).start();
    }
}
