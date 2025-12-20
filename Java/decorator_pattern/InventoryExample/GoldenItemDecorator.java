package Java.decorator_pattern.InventoryExample;

/**
 * Concrete Decorator - Golden
 * This decorator adds "Golden" prefix to the name and increases the price by 1000.
 */
public class GoldenItemDecorator extends ItemDecorator {

    public GoldenItemDecorator(Item item) {
        super(item);
    }

    @Override
    public String getName() {
        return "Golden " + wrappedItem.getName();
    }

    @Override
    public double getPrice() {
        return 1000 + wrappedItem.getPrice();
    }

    @Override
    public void print() {
        System.out.println(getName() + " costs $" + String.format("%.2f", getPrice()));
    }
}

