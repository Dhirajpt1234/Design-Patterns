package Java.decorator_pattern.Furniture;

/**
 * InventoryFurnitureItem is a concrete implementation of the FurnitureItem interface.
 * This class represents basic furniture items available in inventory.
 * This is the ConcreteComponent in the Decorator design pattern.
 */
public class InventoryFurnitureItem implements FurnitureItem {

    private String name;
    private int price;

    /**
     * Constructor to create a new inventory furniture item
     * @param name The name of the furniture item
     * @param price The price of the furniture item
     */
    public InventoryFurnitureItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void print() {
        System.out.println("This is the normal furniture item: " + name + " priced at $" + price);
    }

}
