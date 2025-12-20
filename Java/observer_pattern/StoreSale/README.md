# Observer Pattern - Store Sale Example

## Overview
This example demonstrates the Observer Pattern using a store sale notification system. Stores (subjects) notify shoppers and malls (observers) when they have sales.

## Pattern Structure

### Components

1. **Observer Interface** (`Observer.java`)
   - Defines the contract for objects that should be notified of changes
   - Contains `notify(String storeName, int discount)` method

2. **Subject Interface** (`Subject.java`)
   - Defines the contract for objects that can be observed
   - Contains methods: `subscribe()`, `unsubscribe()`, and `notifyObservers()`

3. **Store Class** (`Store.java`) - Concrete Subject
   - Implements `Subject` interface
   - Maintains a list of observers
   - Notifies all observers when a sale is announced

4. **Shopper Class** (`Shopper.java`) - Concrete Observer
   - Implements `Observer` interface
   - Individual shoppers who want to be notified about sales
   - Displays a message when notified

5. **Mall Class** (`Mall.java`) - Concrete Observer
   - Implements `Observer` interface
   - Tracks all sales from different stores
   - Maintains a record of all sale events

6. **Client Class** (`Client.java`)
   - Demonstrates the pattern in action
   - Shows subscription, notification, and unsubscription

## How to Run

```bash
# Compile all Java files
javac Java/observer_pattern/StoreSale/*.java

# Run the client
java Java.observer_pattern.StoreSale.Client
```

## Expected Output

The program will:
1. Create stores and shoppers
2. Subscribe observers to stores
3. Announce sales and notify all subscribers
4. Demonstrate dynamic subscription/unsubscription
5. Display all sales records tracked by the mall

## Key Benefits

- **Loose Coupling**: Stores don't need to know about specific observer types
- **Dynamic Relationships**: Observers can be added/removed at runtime
- **Broadcast Communication**: One sale announcement notifies all subscribers
- **Extensibility**: Easy to add new observer types without modifying existing code

## Real-World Applications

- Event handling systems
- Model-View-Controller (MVC) architecture
- Publish-Subscribe messaging systems
- Notification systems
- Stock market price updates
- Weather monitoring systems

