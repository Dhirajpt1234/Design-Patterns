# Factory Pattern: Restaurant Example (Java)

## Overview
This example demonstrates the **Factory Design Pattern** using a restaurant scenario in Java. The Factory Pattern is a creational design pattern that provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.

## Structure
- **Location:** `Java/factory_pattern/Restaurant/`
- **Main Components:**
  - Factory class for creating different types of restaurant dishes or services
  - Concrete classes representing specific dishes or services
  - Client code that uses the factory to obtain objects

## Key Concepts
- **Factory Pattern:**
  - Encapsulates object creation logic
  - Promotes loose coupling by eliminating the need to bind application-specific classes into the code
  - Makes the code more robust, less coupled, and easy to extend

## Example Usage
Suppose the restaurant offers different cuisines (e.g., Italian, Chinese, Indian). The factory will decide which cuisine object to instantiate based on input.

```java
// Example usage (pseudo-code):
DishFactory factory = new DishFactory();
Dish dish = factory.createDish("Italian");
dish.serve();
```

## How to Run
1. Navigate to the `Java/factory_pattern/Restaurant/` directory.
2. Compile the Java files:
   ```sh
   javac *.java
   ```
3. Run the main class (replace `MainClass` with the actual main class name):
   ```sh
   java MainClass
   ```

## Benefits of Factory Pattern
- Centralizes object creation
- Makes code easier to maintain and extend
- Supports the Open/Closed Principle

## References
- [Factory Method Pattern - Wikipedia](https://en.wikipedia.org/wiki/Factory_method_pattern)
- [Factory Pattern in Java - Baeldung](https://www.baeldung.com/java-factory-pattern)

---
*This example is part of the NodeJS-Design-Patterns repository, under Java design patterns.*
