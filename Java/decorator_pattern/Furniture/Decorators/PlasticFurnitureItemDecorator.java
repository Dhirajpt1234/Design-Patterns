package Java.decorator_pattern.Furniture.Decorators;

import Java.decorator_pattern.Furniture.FurnitureItem;

/**
 * PlasticFurnitureItemDecorator is a concrete decorator that adds plastic material
 * to any furniture item. This decorator adds the "Plastic" prefix to the furniture name
 * and increases the price by 500.
 */
public class PlasticFurnitureItemDecorator extends FurnitureItemDecorator {

    /**
     * Constructor to wrap a furniture item with plastic decoration
     * @param item The furniture item to be decorated
     */
    public PlasticFurnitureItemDecorator(FurnitureItem item) {
        super(item);
    }

    /**
     * Returns the name of the furniture with "Plastic" prefix
     * @return The decorated furniture name
     */
    @Override
    public String getName() {
        return "Plastic " + wrappedItem.getName();
    }

    /**
     * Returns the price of the furniture plus the plastic decoration cost (500)
     * @return The total price after adding plastic decoration
     */
    @Override
    public int getPrice() {
        return 500 + wrappedItem.getPrice();
    }

    /**
     * Prints information about the plastic furniture item
     */
    @Override
    public void print() {
        System.out.println("This is the plastic furniture item - lightweight and affordable");
    }

}
