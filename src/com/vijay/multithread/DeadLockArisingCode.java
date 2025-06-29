package com.vijay.multithread;

public class DeadLockArisingCode {

	    static final Object A = new Object();
	    static final Object B = new Object();

	    public static void main(String[] args) {
	        Thread t1 = new Thread(() -> {
	            synchronized (A) {
	                System.out.println("Thread 1: Locked A");
	                try { Thread.sleep(100); } catch (Exception e) {}
	                synchronized (B) {
	                    System.out.println("Thread 1: Locked B");
	                }
	            }
	        });

	        Thread t2 = new Thread(() -> {
	            synchronized (B) {
	                System.out.println("Thread 2: Locked B");
	                try { Thread.sleep(100); } catch (Exception e) {}
	                synchronized (A) {
	                    System.out.println("Thread 2: Locked A");
	                }
	            }
	        });

	        t1.start();
	        t2.start();
	    }
	}
