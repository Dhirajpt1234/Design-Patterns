package Java.observer_pattern.StoreSale;

/**
 * Client class to demonstrate the Observer Pattern
 * 
 * OBSERVER PATTERN EXPLANATION:
 * ==============================
 * The Observer Pattern defines a one-to-many dependency between objects so that
 * when one object (subject) changes state, all its dependents (observers) are
 * notified and updated automatically.
 * 
 * Key Components:
 * 1. Subject (Store) - Maintains a list of observers and notifies them of changes
 * 2. Observer (Shopper, Mall) - Defines an interface for objects that should be
 *    notified of changes in the subject
 * 3. ConcreteSubject (Store) - Stores state and notifies observers when state changes
 * 4. ConcreteObserver (Shopper, Mall) - Implements the Observer interface and
 *    maintains a reference to the subject
 * 
 * Benefits:
 * - Loose coupling between subject and observers
 * - Dynamic relationships - observers can be added/removed at runtime
 * - Broadcast communication - one change can notify multiple observers
 * - Follows Open/Closed Principle
 * 
 * Use Cases:
 * - Event handling systems
 * - Model-View-Controller (MVC) architecture
 * - Publish-Subscribe systems
 * - Notification systems
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=== OBSERVER PATTERN DEMONSTRATION ===\n");
        
        // Create stores (subjects)
        Store catsAndThings = new Store("Cats & Things");
        Store insAndOuts = new Store("Ins and Outs");
        
        // Create shoppers (observers)
        Shopper alex = new Shopper("Alex");
        Shopper eve = new Shopper("Eve");
        Shopper sharon = new Shopper("Sharon");
        Shopper mike = new Shopper("Mike");
        
        // Create mall (observer that tracks all sales)
        Mall valleyMall = new Mall();
        
        System.out.println("--- Setting up subscriptions ---");
        // Subscribe observers to stores
        catsAndThings.subscribe(alex);
        catsAndThings.subscribe(eve);
        catsAndThings.subscribe(mike);
        catsAndThings.subscribe(valleyMall);
        
        insAndOuts.subscribe(sharon);
        insAndOuts.subscribe(valleyMall);
        
        System.out.println("\n--- Announcing Sales ---");
        // Stores announce sales - all subscribed observers are notified
        catsAndThings.sale(20);
        insAndOuts.sale(50);
        
        // Display mall's sales records
        valleyMall.printSales();
        
        System.out.println("\n--- Demonstrating dynamic subscription ---");
        // Subscribe a new observer at runtime
        Shopper newShopper = new Shopper("Sarah");
        catsAndThings.subscribe(newShopper);
        
        // Announce another sale - new observer will be notified
        catsAndThings.sale(30);
        
        System.out.println("\n--- Demonstrating unsubscription ---");
        // Unsubscribe an observer
        catsAndThings.unsubscribe(eve);
        
        // Announce sale - unsubscribed observer won't be notified
        catsAndThings.sale(15);
        
        // Final sales records
        valleyMall.printSales();
    }
}

