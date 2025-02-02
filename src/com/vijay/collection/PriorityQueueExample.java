package com.vijay.collection;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(20);
        pq.add(10);
        pq.add(30);

        System.out.println("PriorityQueue (smallest first): " + pq);
    }
}
