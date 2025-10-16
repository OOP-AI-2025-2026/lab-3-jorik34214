package org.example.task2;

public class Order {
    private Cart cart;
    private String customerName;

    public Order(String customerName, Cart cart) {
        this.customerName = customerName;
        this.cart = cart;
    }

    public void confirmOrder() {
        System.out.println("Замовлення для " + this.customerName + " підтверджено!");
        System.out.println("До сплати: " + this.cart.getTotalPrice() + " грн");
    }
}
