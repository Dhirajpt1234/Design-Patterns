# Abstract Factory Pattern - Vehicle Factory

## Overview
This example demonstrates the Abstract Factory design pattern using a vehicle manufacturing system. The pattern allows creating families of related vehicles (cars and motorcycles) without specifying their concrete classes.

## Structure
```
Vehicle_Factory/
├── factory/
│   ├── VehicleFactory.java           # Abstract Factory
│   ├── LuxuryVehicleFactory.java     # Concrete Factory for Luxury vehicles
│   └── EconomyVehicleFactory.java    # Concrete Factory for Economy vehicles
├── car/
│   ├── Car.java                      # Abstract Product
│   ├── LuxuryCar.java                # Concrete Product
│   └── EconomyCar.java               # Concrete Product
├── motorcycle/
│   ├── Motorcycle.java               # Abstract Product
│   ├── LuxuryMotorcycle.java         # Concrete Product
│   └── EconomyMotorcycle.java        # Concrete Product
└── client/
    └── VehicleClient.java            # Client code
```

## How to Run
```bash
javac -d . client/VehicleClient.java
java Java.abstract_factory.Vehicle_Factory.client.VehicleClient
```

## Pattern Components

### Abstract Factory
- `VehicleFactory` - Abstract factory that defines methods for creating vehicles

### Concrete Factories
- `LuxuryVehicleFactory` - Creates luxury vehicles (Mercedes-Benz, Harley-Davidson)
- `EconomyVehicleFactory` - Creates economy vehicles (Toyota, Honda)

### Abstract Products
- `Car` - Abstract car interface
- `Motorcycle` - Abstract motorcycle interface

### Concrete Products
- `LuxuryCar`, `EconomyCar` - Specific car implementations
- `LuxuryMotorcycle`, `EconomyMotorcycle` - Specific motorcycle implementations

## Output Example
```
🚗 Abstract Factory Pattern - Vehicle Factory Example

💰 Testing Economy Vehicles:
Testing Toyota car:
Driving an economy car with fuel efficiency

Testing Honda motorcycle:
Riding an economy motorcycle with good mileage

💎 Testing Luxury Vehicles:
Testing Mercedes-Benz car:
Driving a luxury car with premium features

Testing Harley-Davidson motorcycle:
Riding a luxury motorcycle with high performance

✅ Abstract Factory pattern demonstration completed!
```

## Benefits
1. **Consistency**: Ensures vehicles from the same category work together
2. **Flexibility**: Easy to add new vehicle types by creating new factories
3. **Decoupling**: Client code doesn't depend on concrete vehicle classes
4. **Scalability**: Can easily extend to new vehicle categories
