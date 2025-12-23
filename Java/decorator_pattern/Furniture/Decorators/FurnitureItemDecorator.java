package Java.decorator_pattern.Furniture.Decorators;

import Java.decorator_pattern.Furniture.FurnitureItem;

/**
 * FurnitureItemDecorator is the abstract decorator class that implements the FurnitureItem interface.
 * This class serves as the base for all concrete decorators in the Decorator design pattern.
 * It maintains a reference to a FurnitureItem object and delegates all operations to it.
 * Concrete decorators extend this class to add additional functionality.
 */
public abstract class FurnitureItemDecorator implements FurnitureItem {

    /**
     * The furniture item that is being decorated
     */
    protected FurnitureItem wrappedItem;

    /**
     * Constructor to initialize the decorator with a furniture item
     * @param item The furniture item to be decorated
     */
    public FurnitureItemDecorator(FurnitureItem item) {
        this.wrappedItem = item;
    }

    @Override
    public String getName() {
        return wrappedItem.getName();
    }

    @Override
    public int getPrice() {
        return wrappedItem.getPrice();
    }

    @Override
    public void print() {
        wrappedItem.print();
    }

}
