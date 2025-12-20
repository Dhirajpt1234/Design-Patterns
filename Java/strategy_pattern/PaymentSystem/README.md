# Strategy Pattern - Payment System Example

## Overview
This example demonstrates the Strategy Pattern using a payment processing system. The system can process payments using different methods (Credit Card, PayPal, Bank Transfer) that can be interchanged at runtime.

## Pattern Structure

### Components

1. **PaymentStrategy Interface** (`PaymentStrategy.java`)
   - Defines the contract for all payment strategies
   - Contains `processPayment(double amount)` and `getPaymentMethod()` methods
   - All concrete strategies must implement this interface

2. **CreditCardPayment Class** (`CreditCardPayment.java`) - Concrete Strategy
   - Implements payment processing using credit card
   - Handles card validation and payment processing
   - Masks sensitive card information for display

3. **PayPalPayment Class** (`PayPalPayment.java`) - Concrete Strategy
   - Implements payment processing using PayPal
   - Handles PayPal account validation and payment processing

4. **BankTransferPayment Class** (`BankTransferPayment.java`) - Concrete Strategy
   - Implements payment processing using bank transfer
   - Handles bank account validation and transfer initiation

5. **PaymentProcessor Class** (`PaymentProcessor.java`) - Context
   - Maintains a reference to a PaymentStrategy object
   - Provides methods to set and change the payment strategy
   - Delegates payment processing to the current strategy
   - Can switch between different payment strategies at runtime

6. **Client Class** (`Client.java`)
   - Demonstrates the pattern in action
   - Shows how to use different payment strategies
   - Demonstrates runtime strategy switching

## How to Run

```bash
# Compile all Java files
javac Java/strategy_pattern/PaymentSystem/*.java

# Run the client
java Java.strategy_pattern.PaymentSystem.Client
```

## Expected Output

The program will:
1. Process payments using different payment methods (Credit Card, PayPal, Bank Transfer)
2. Demonstrate switching between payment strategies at runtime
3. Show how the same PaymentProcessor can handle different payment methods
4. Process multiple orders with different payment strategies

## Key Benefits

- **Encapsulation**: Each payment algorithm is encapsulated in its own class
- **Interchangeability**: Payment strategies can be swapped at runtime
- **Extensibility**: Easy to add new payment methods without modifying existing code
- **Maintainability**: Each payment method is isolated, making code easier to maintain
- **Open/Closed Principle**: Open for extension (new strategies), closed for modification

## Real-World Applications

- Payment processing systems
- Sorting algorithms (QuickSort, MergeSort, BubbleSort)
- Compression algorithms (ZIP, RAR, 7ZIP)
- Validation strategies (email, phone, credit card validation)
- Logging strategies (console, file, database logging)
- Discount calculation strategies (percentage, fixed, seasonal discounts)
- Navigation algorithms (driving, walking, public transport)
- Image processing filters (blur, sharpen, grayscale)

## Design Principles Demonstrated

1. **Strategy Pattern**: Encapsulates algorithms and makes them interchangeable
2. **Open/Closed Principle**: Open for extension (new strategies), closed for modification
3. **Single Responsibility Principle**: Each strategy class has one responsibility
4. **Dependency Inversion**: High-level modules depend on abstractions (PaymentStrategy interface)

