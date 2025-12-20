package Java.decorator_pattern.InventoryExample;

/**
 * Concrete Component
 * This is the base object that we want to add features to dynamically.
 */
public class InventoryItem implements Item {
    private String name;
    private double price;

    public InventoryItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println(name + " costs $" + String.format("%.2f", price));
    }
}

