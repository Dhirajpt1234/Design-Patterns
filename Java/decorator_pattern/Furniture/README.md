# Decorator Pattern - Furniture Example

This example demonstrates the **Decorator Design Pattern** using furniture items with different material decorations (Wooden, Plastic, and Metal).

## Overview

The Decorator Pattern allows dynamic addition of new functionality to objects without altering their structure. In this example, we can wrap basic furniture items with different material decorators to change their properties like name, price, and description.

## Structure

### Core Components

1. **FurnitureItem** (Component Interface)
   - Defines the contract for all furniture items
   - Methods: `getName()`, `getPrice()`, `print()`

2. **InventoryFurnitureItem** (Concrete Component)
   - Basic implementation of furniture items
   - Represents standard furniture available in inventory

3. **FurnitureItemDecorator** (Abstract Decorator)
   - Base class for all decorators
   - Maintains reference to the wrapped furniture item
   - Delegates operations to the wrapped item by default

4. **Concrete Decorators**
   - **WoodenFurnitureItemDecorator**: Adds wooden material (+$1000)
   - **PlasticFurnitureItemDecorator**: Adds plastic material (+$500)
   - **MetalFurnitureItemDecorator**: Adds metal material (+$1500)

## Key Features

- **Dynamic Decoration**: Add materials to furniture at runtime
- **Stackable Decorators**: Combine multiple decorators (e.g., Wooden + Metal)
- **Flexible Pricing**: Each decorator adds its own cost
- **Enhanced Descriptions**: Each material type provides unique descriptions

## Example Usage

```java
// Create basic furniture
FurnitureItem chair = new InventoryFurnitureItem("Chair", 50);

// Apply single decorator
FurnitureItem woodenChair = new WoodernFurnitureItemDecorator(chair);

// Stack multiple decorators
FurnitureItem luxuryChair = new MetalFurnitureItemDecorator(
                                new WoodernFurnitureItemDecorator(chair));
```

## Output Example

```
Basic Chair: $50
Wooden Chair: $1,050 (Basic + $1,000 for wood)
Plastic Chair: $550 (Basic + $500 for plastic)
Luxury Chair: $2,550 (Basic + $1,000 + $1,500 for stacked decorators)
```

## Benefits

1. **Open/Closed Principle**: Open for extension, closed for modification
2. **Flexible Composition**: Mix and match decorators as needed
3. **Runtime Flexibility**: Change object behavior dynamically
4. **Single Responsibility**: Each decorator handles one specific enhancement

## How to Run

```bash
# Compile all Java files
javac Java/decorator_pattern/Furniture/*.java Java/decorator_pattern/Furniture/Decorators/*.java

# Run the demo
java Java.decorator_pattern.Furniture.Client
```

This example clearly shows how the Decorator Pattern enables dynamic behavior enhancement while maintaining clean object-oriented design principles.
