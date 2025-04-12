package org.example;

public class ShoppingCart {
    LinkedList items;

    public ShoppingCart() {
        this.items = new LinkedList();
    }
    public void addItem(String item) {
        this.items.append(item);

    }
    public void deleteItem(String item) {
        this.items.remove(item);

    }
    public void printItem() {
        this.items.display();

    }
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Apple");
        cart.addItem("Banana");
        cart.addItem("Orange");
        cart.printItem();
        cart.deleteItem("Apple");
        cart.printItem();
        cart.addItem("Mango");
        cart.printItem();
        cart.deleteItem("Mango");
        cart.printItem();

    }
}
