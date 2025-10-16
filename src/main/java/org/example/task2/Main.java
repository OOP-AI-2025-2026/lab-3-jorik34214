package org.example.task2;

public class Main {
    public static void main(String[] args) {
        Item phone = new Item("Смартфон", 12000);
        Item laptop = new Item("Ноутбук", 25000);

        Cart cart = new Cart();
        cart.addItem(phone);
        cart.addItem(laptop);

        System.out.println("Товари у кошику:");
        cart.showItems();

        Order order = new Order("Петро", cart);
        order.confirmOrder();

        try {
            Box box = new Box(5.0, 3.0, 2.0);
            System.out.println("Площа поверхні: " + box.getSurfaceArea());
            System.out.println("Площа бічної поверхні: " + box.getLateralSurfaceArea());
            System.out.println("Об'єм: " + box.getVolume());
        } catch (IllegalArgumentException e) {
            System.out.println("Помилка при створенні коробки: " + e.getMessage());
        }

        IntStack stack = new IntStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);           // IntStack: [10, 20, 30]
        System.out.println("peek(): " + stack.peek()); // 30
        System.out.println("pop(): " + stack.pop());   // 30
        System.out.println("size(): " + stack.size()); // 2

        stack.clear();
        System.out.println("isEmpty(): " + stack.isEmpty()); // true
    }
}
