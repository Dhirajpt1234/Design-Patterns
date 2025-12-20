# Decorator Pattern Example

## Overview
This example demonstrates the **Decorator Pattern** using an inventory system where items can be decorated with "Golden" or "Diamond" enhancements.

## What is the Decorator Pattern?

The Decorator Pattern allows you to add new functionality to objects dynamically without altering their structure. It's an alternative to subclassing for extending functionality.

## Structure

```
Item (Interface)
    ↑
    ├── InventoryItem (Concrete Component)
    └── ItemDecorator (Abstract Decorator)
            ↑
            ├── GoldenItemDecorator (Concrete Decorator)
            └── DiamondItemDecorator (Concrete Decorator)
```

## Key Components

1. **Item (Component Interface)**
   - Defines the interface for objects that can have responsibilities added dynamically

2. **InventoryItem (Concrete Component)**
   - The base object to which we can add features

3. **ItemDecorator (Abstract Decorator)**
   - Maintains a reference to an Item object
   - Defines an interface that conforms to Item's interface

4. **GoldenItemDecorator & DiamondItemDecorator (Concrete Decorators)**
   - Add specific responsibilities to the component
   - Can be chained together

## How to Run

```bash
cd Java/decorator_pattern/InventoryExample
javac *.java
java Client
```

## Example Output

```
=== DECORATOR PATTERN DEMONSTRATION ===

--- Base Items ---
Walkman costs $29.99
Necklace costs $9.99

--- Decorated Items ---
Golden Necklace costs $1009.99

Diamond Golden Necklace costs a lot of money... ($2009.99)
  * This item can cut glass!

Diamond Walkman costs a lot of money... ($1029.99)
  * This item can cut glass!

--- Purchasing Items ---
Purchasing item: Diamond Golden Necklace
Purchasing item: Diamond Walkman

Alex has purchased 2 items:
   * Diamond Golden Necklace - $2009.99
   * Diamond Walkman - $1029.99
Alex has $960.02 remaining.
```

## Benefits

- ✅ **Flexibility**: Add features at runtime
- ✅ **Composition over Inheritance**: More flexible than subclassing
- ✅ **Open/Closed Principle**: Open for extension, closed for modification
- ✅ **Single Responsibility**: Each decorator has one job
- ✅ **Composable**: Decorators can be chained in any order

## Real-World Use Cases

- Java I/O streams (`BufferedReader`, `FileReader`, etc.)
- GUI components (adding borders, scrollbars, etc.)
- Middleware in web frameworks
- Adding features to objects without modifying their classes

