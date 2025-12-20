# Facade Pattern Example - Home Theater System

## Overview
This example demonstrates the **Facade Pattern** using a Home Theater System. The facade simplifies the complex interactions between multiple subsystems (Amplifier, DVD Player, Projector, Screen, Theater Lights) into simple methods like `watchMovie()` and `endMovie()`.

## How to Run

### Compile and Run
```bash
cd Java/facade_pattern/HomeTheater

# Compile all Java files
javac *.java

# Run the Client
java Client
```

### Or compile and run in one command
```bash
cd Java/facade_pattern/HomeTheater
javac *.java && java Client
```

## What You'll See

The program demonstrates:
1. **Using the Facade** - Simple one-method calls to watch and end movies
2. **Without the Facade** - The complex way of manually coordinating all subsystems
3. **Comparison** - Shows how the facade simplifies the client code

## Key Learning Points

- **Facade Pattern** provides a simplified interface to a complex subsystem
- Instead of calling multiple methods on different objects, you call one method on the facade
- The facade coordinates all the subsystem components internally
- This reduces coupling between the client and the subsystem
- Makes the code easier to use and maintain

## Structure

- `HomeTheaterFacade.java` - The facade that simplifies subsystem interactions
- `Amplifier.java` - Subsystem component
- `DvdPlayer.java` - Subsystem component
- `Projector.java` - Subsystem component
- `Screen.java` - Subsystem component
- `TheaterLights.java` - Subsystem component
- `Client.java` - Demonstrates the pattern usage

