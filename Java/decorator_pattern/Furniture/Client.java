package Java.decorator_pattern.Furniture;

import Java.decorator_pattern.Furniture.Decorators.WoodernFurnitureItemDecorator;
import Java.decorator_pattern.Furniture.Decorators.PlasticFurnitureItemDecorator;
import Java.decorator_pattern.Furniture.Decorators.MetalFurnitureItemDecorator;

/**
 * Client class to demonstrate the Decorator Design Pattern with furniture items.
 * This class shows how different material decorators can be applied to furniture items
 * to dynamically add functionality and modify their properties.
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=== Decorator Pattern Demo - Furniture Items ===");
        System.out.println();

        // Create basic furniture items
        System.out.println("Creating basic furniture items:");
        FurnitureItem chair = new InventoryFurnitureItem("Chair", 50);
        FurnitureItem table = new InventoryFurnitureItem("Table", 100);
        FurnitureItem sofa = new InventoryFurnitureItem("Sofa", 200);

        System.out.println("\n--- Basic Furniture Items ---");
        displayFurnitureDetails("Chair", chair);
        displayFurnitureDetails("Table", table);
        displayFurnitureDetails("Sofa", sofa);

        System.out.println("\n--- Wooden Furniture Items ---");
        // Apply wooden decorator
        FurnitureItem woodenChair = new WoodernFurnitureItemDecorator(chair);
        FurnitureItem woodenTable = new WoodernFurnitureItemDecorator(table);
        displayFurnitureDetails("Wooden Chair", woodenChair);
        displayFurnitureDetails("Wooden Table", woodenTable);

        System.out.println("\n--- Plastic Furniture Items ---");
        // Apply plastic decorator
        FurnitureItem plasticChair = new PlasticFurnitureItemDecorator(chair);
        FurnitureItem plasticSofa = new PlasticFurnitureItemDecorator(sofa);
        displayFurnitureDetails("Plastic Chair", plasticChair);
        displayFurnitureDetails("Plastic Sofa", plasticSofa);

        System.out.println("\n--- Metal Furniture Items ---");
        // Apply metal decorator
        FurnitureItem metalTable = new MetalFurnitureItemDecorator(table);
        FurnitureItem metalSofa = new MetalFurnitureItemDecorator(sofa);
        displayFurnitureDetails("Metal Table", metalTable);
        displayFurnitureDetails("Metal Sofa", metalSofa);

        System.out.println("\n--- Multiple Decorators (Stacking) ---");
        // Demonstrate stacking multiple decorators
        FurnitureItem luxuryChair = new MetalFurnitureItemDecorator(
                                    new WoodernFurnitureItemDecorator(chair));
        displayFurnitureDetails("Luxury Chair (Wooden + Metal)", luxuryChair);

        FurnitureItem premiumTable = new MetalFurnitureItemDecorator(
                                   new PlasticFurnitureItemDecorator(table));
        displayFurnitureDetails("Premium Table (Plastic + Metal)", premiumTable);

        System.out.println("\n=== Decorator Pattern Demo Completed ===");
    }

    /**
     * Helper method to display furniture details in a formatted way
     * @param label Description of the furniture item
     * @param item The furniture item to display
     */
    private static void displayFurnitureDetails(String label, FurnitureItem item) {
        System.out.println(label + ":");
        System.out.println("  Name: " + item.getName());
        System.out.println("  Price: $" + item.getPrice());
        System.out.print("  Description: ");
        item.print();
        System.out.println();
    }
}
