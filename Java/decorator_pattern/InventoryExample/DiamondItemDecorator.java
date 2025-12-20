package Java.decorator_pattern.InventoryExample;

/**
 * Concrete Decorator - Diamond
 * This decorator adds "Diamond" prefix to the name and increases the price by 1000.
 * It also adds a special property (cutsGlass) that only diamond items have.
 */
public class DiamondItemDecorator extends ItemDecorator {
    private boolean cutsGlass = true;

    public DiamondItemDecorator(Item item) {
        super(item);
    }

    @Override
    public String getName() {
        return "Diamond " + wrappedItem.getName();
    }

    @Override
    public double getPrice() {
        return 1000 + wrappedItem.getPrice();
    }

    @Override
    public void print() {
        System.out.println(getName() + " costs a lot of money... ($" + String.format("%.2f", getPrice()) + ")");
        if (cutsGlass) {
            System.out.println("  * This item can cut glass!");
        }
    }

    public boolean canCutGlass() {
        return cutsGlass;
    }
}

