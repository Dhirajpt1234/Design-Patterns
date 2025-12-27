package Java.state_pattern.VendingMachine.ItemUtils;

/**
 * Represents a vending machine item with name and price.
 * Encapsulates item data with validation.
 */
public class Item {
    private final String name;
    private final int price;

    /**
     * Constructs an Item with name and price.
     * 
     * @param name the name of the item (must not be null or empty)
     * @param price the price of the item in cents (must be positive)
     * @throws IllegalArgumentException if name is null/empty or price is non-positive
     */
    public Item(String name, int price) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Item name cannot be null or empty");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Item price must be positive");
        }
        this.name = name;
        this.price = price;
    }

    /**
     * Gets the name of the item.
     * @return the item name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the price of the item.
     * @return the price in cents
     */
    public int getPrice() {
        return price;
    }
}
