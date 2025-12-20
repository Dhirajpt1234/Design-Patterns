package Java.decorator_pattern.InventoryExample;

/**
 * Component Interface
 * This is the base interface that both concrete components and decorators will implement.
 */
public interface Item {
    String getName();
    double getPrice();
    void print();
}

