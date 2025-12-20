package Java.decorator_pattern.InventoryExample;

/**
 * Abstract Decorator
 * This is the base decorator class that all concrete decorators will extend.
 * It maintains a reference to the Item interface and delegates calls to it.
 */
public abstract class ItemDecorator implements Item {
    protected Item wrappedItem;

    public ItemDecorator(Item wrappedItem) {
        this.wrappedItem = wrappedItem;
    }

    @Override
    public String getName() {
        return wrappedItem.getName();
    }

    @Override
    public double getPrice() {
        return wrappedItem.getPrice();
    }

    @Override
    public void print() {
        wrappedItem.print();
    }
}

