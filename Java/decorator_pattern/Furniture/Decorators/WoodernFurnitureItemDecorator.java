package Java.decorator_pattern.Furniture.Decorators;

import Java.decorator_pattern.Furniture.FurnitureItem;

/**
 * WoodenFurnitureItemDecorator is a concrete decorator that adds wood material
 * to any furniture item. This decorator adds the "Wooden" prefix to the furniture name
 * and increases the price by 1000, representing the cost of solid wood construction.
 */
public class WoodernFurnitureItemDecorator extends FurnitureItemDecorator {

    /**
     * Constructor to wrap a furniture item with wooden decoration
     * @param item The furniture item to be decorated
     */
    public WoodernFurnitureItemDecorator(FurnitureItem item) {
        super(item);
    }

    /**
     * Returns the name of the furniture with "Wooden" prefix
     * @return The decorated furniture name
     */
    @Override
    public String getName() {
        return "Wooden " + wrappedItem.getName();
    }

    /**
     * Returns the price of the furniture plus the wooden decoration cost (1000)
     * @return The total price after adding wooden decoration
     */
    @Override
    public int getPrice() {
        return 1000 + wrappedItem.getPrice();
    }

    /**
     * Prints information about the wooden furniture item
     */
    @Override
    public void print() {
        System.out.println("This is the wooden furniture item - classic and elegant");
    }

}
