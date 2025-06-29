package com.vijay;

enum OrderStatus {
    PENDING, SHIPPED, DELIVERED, CANCELLED;
}
//Real-World Example – Order Status Management - Managing an Order Status using enum:
public class EnumWithOrder {  
    private int orderId;
    private OrderStatus status; // Using enum

    public EnumWithOrder(int orderId, OrderStatus status) {
        this.orderId = orderId;
        this.status = status;
    }
    public void printStatus() {
        System.out.println("Order " + orderId + " is " + status);
    }
    public static void main(String[] args) {
        EnumWithOrder order1 = new EnumWithOrder(101, OrderStatus.SHIPPED);
        order1.printStatus(); // ✅ Output: Order 101 is SHIPPED
    }
}

