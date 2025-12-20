package Java.decorator_pattern.InventoryExample;

/**
 * Client class to demonstrate the Decorator Pattern
 * 
 * DECORATOR PATTERN EXPLANATION:
 * ==============================
 * The Decorator Pattern allows you to add new functionality to objects dynamically
 * without altering their structure. It's useful when you want to add features to
 * objects at runtime in a flexible way.
 * 
 * Key Components:
 * 1. Component (Item interface) - Defines the interface for objects that can have
 *    responsibilities added to them dynamically
 * 2. ConcreteComponent (InventoryItem) - Defines an object to which additional
 *    responsibilities can be attached
 * 3. Decorator (ItemDecorator) - Maintains a reference to a Component object and
 *    defines an interface that conforms to Component's interface
 * 4. ConcreteDecorator (GoldenItemDecorator, DiamondItemDecorator) - Adds
 *    responsibilities to the component
 * 
 * Benefits:
 * - More flexible than inheritance
 * - Responsibilities can be added/removed at runtime
 * - Decorators can be composed in any order
 * - Follows Open/Closed Principle (open for extension, closed for modification)
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=== DECORATOR PATTERN DEMONSTRATION ===\n");

        // Create a shopper with $4000
        Shopper alex = new Shopper("Alex", 4000);

        // Create base items
        Item walkman = new InventoryItem("Walkman", 29.99);
        Item necklace = new InventoryItem("Necklace", 9.99);

        System.out.println("--- Base Items ---");
        walkman.print();
        necklace.print();
        System.out.println();

        // Apply decorators to items
        // You can wrap items with decorators to add features dynamically
        
        // Single decorator: Make necklace golden
        Item goldenNecklace = new GoldenItemDecorator(necklace);
        
        // Multiple decorators: Make necklace golden AND diamond (chained decorators)
        Item diamondGoldenNecklace = new DiamondItemDecorator(
            new GoldenItemDecorator(necklace)
        );
        
        // Single decorator: Make walkman diamond
        Item diamondWalkman = new DiamondItemDecorator(walkman);

        System.out.println("--- Decorated Items ---");
        goldenNecklace.print();
        System.out.println();
        diamondGoldenNecklace.print();
        System.out.println();
        diamondWalkman.print();
        System.out.println();

        // Purchase decorated items
        System.out.println("--- Purchasing Items ---");
        alex.purchase(diamondGoldenNecklace);
        alex.purchase(diamondWalkman);

        // Print final status
        alex.printStatus();

        // Demonstrate that decorators can be applied in any order
        System.out.println("--- Decorator Composition Example ---");
        Item item1 = new InventoryItem("Ring", 50.0);
        Item item2 = new GoldenItemDecorator(item1);
        Item item3 = new DiamondItemDecorator(item2);
        item3.print();
        
        // You can also apply decorators in reverse order
        Item item4 = new InventoryItem("Watch", 100.0);
        Item item5 = new DiamondItemDecorator(item4);
        Item item6 = new GoldenItemDecorator(item5);
        item6.print();
    }
}

