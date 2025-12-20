package Java.decorator_pattern.InventoryExample;

import java.util.ArrayList;
import java.util.List;

/**
 * Shopper class to demonstrate the decorator pattern in action
 */
public class Shopper {
    private String name;
    private double account;
    private List<Item> items;

    public Shopper(String name, double account) {
        this.name = name;
        this.account = account;
        this.items = new ArrayList<>();
    }

    public void purchase(Item item) {
        if (item.getPrice() > account) {
            System.out.println("Cannot afford " + item.getName());
        } else {
            System.out.println("Purchasing item: " + item.getName());
            account -= item.getPrice();
            items.add(item);
        }
    }

    public void printStatus() {
        System.out.println("\n" + name + " has purchased " + items.size() + " items:");
        for (Item item : items) {
            System.out.println("   * " + item.getName() + " - $" + String.format("%.2f", item.getPrice()));
        }
        System.out.println(name + " has $" + String.format("%.2f", account) + " remaining.\n");
    }
}

