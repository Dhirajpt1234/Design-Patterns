package Java.decorator_pattern.Furniture.Decorators;

import Java.decorator_pattern.Furniture.FurnitureItem;

/**
 * MetalFurnitureItemDecorator is a concrete decorator that adds metal material
 * to any furniture item. This decorator adds the "Metal" prefix to the furniture name
 * and increases the price by 1500, representing the premium cost of metal furniture.
 */
public class MetalFurnitureItemDecorator extends FurnitureItemDecorator {

    /**
     * Constructor to wrap a furniture item with metal decoration
     * @param item The furniture item to be decorated
     */
    public MetalFurnitureItemDecorator(FurnitureItem item) {
        super(item);
    }

    /**
     * Returns the name of the furniture with "Metal" prefix
     * @return The decorated furniture name
     */
    @Override
    public String getName() {
        return "Metal " + wrappedItem.getName();
    }

    /**
     * Returns the price of the furniture plus the metal decoration cost (1500)
     * @return The total price after adding metal decoration
     */
    @Override
    public int getPrice() {
        return 1500 + wrappedItem.getPrice();
    }

    /**
     * Prints information about the metal furniture item
     */
    @Override
    public void print() {
        System.out.println("This is the metal furniture item - durable and premium quality");
    }

}
