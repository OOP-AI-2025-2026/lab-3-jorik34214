package org.example.task2;

import java.util.ArrayList;

class Cart {
    private ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        this.items.add(item);
    }

    public void removeItem(Item item) {
        this.items.remove(item);
    }

    public double getTotalPrice() {
        double total = 0;
        for (Item item : this.items) {
            total += item.getPrice();
        }
        return total;
    }

    public void showItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }
}