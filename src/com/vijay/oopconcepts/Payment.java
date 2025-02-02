package com.vijay.oopconcepts;
public interface Payment {
    void pay();
    void refund();
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.pay();
        payment.refund();
        
        payment = new UPIPayment();
        payment.pay();
        payment.refund();
    }
}
class CreditCardPayment implements Payment {
    public void pay() {
        System.out.println("Paid with Credit Card");
    }

    public void refund() {
        System.out.println("Refunded to Credit Card");
    }
}
class UPIPayment implements Payment {
    public void pay() {
        System.out.println("Paid with UPI");
    }

    public void refund() {
        System.out.println("Refunded to UPI");
    }
}
