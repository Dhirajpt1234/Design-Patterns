package Java.decorator_pattern.Furniture;

/**
 * FurnitureItem interface defines the contract for all furniture items.
 * This is the Component interface in the Decorator design pattern.
 * It provides basic operations that all furniture items should support.
 */
public interface FurnitureItem {
    /**
     * Returns the name of the furniture item
     * @return The name of the furniture
     */
    String getName();

    /**
     * Returns the price of the furniture item
     * @return The price of the furniture
     */
    int getPrice();

    /**
     * Prints information about the furniture item
     */
    void print();

}
