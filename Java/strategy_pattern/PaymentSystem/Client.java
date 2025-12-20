package Java.strategy_pattern.PaymentSystem;

/**
 * Client class to demonstrate the Strategy Pattern
 * 
 * STRATEGY PATTERN EXPLANATION:
 * ==============================
 * The Strategy Pattern defines a family of algorithms, encapsulates each one,
 * and makes them interchangeable. Strategy lets the algorithm vary independently
 * from the clients that use it.
 * 
 * Key Components:
 * 1. Strategy Interface (PaymentStrategy) - Defines a common interface for all
 *    supported algorithms
 * 2. Concrete Strategies (CreditCardPayment, PayPalPayment, BankTransferPayment) -
 *    Implement the algorithm defined by the Strategy interface
 * 3. Context (PaymentProcessor) - Maintains a reference to a Strategy object
 *    and uses it to execute the algorithm
 * 
 * Benefits:
 * - Encapsulates algorithms in separate classes
 * - Makes algorithms interchangeable at runtime
 * - Eliminates conditional statements for algorithm selection
 * - Follows Open/Closed Principle - open for extension, closed for modification
 * - Promotes code reuse and maintainability
 * 
 * Use Cases:
 * - Payment processing systems
 * - Sorting algorithms
 * - Compression algorithms
 * - Validation strategies
 * - Logging strategies
 * - Discount calculation strategies
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=== STRATEGY PATTERN DEMONSTRATION ===\n");
        
        // Create a payment processor for an order
        PaymentProcessor processor = new PaymentProcessor("ORD-001");
        
        System.out.println("--- Example 1: Credit Card Payment ---");
        // Create and set credit card payment strategy
        PaymentStrategy creditCard = new CreditCardPayment(
            "1234567890123456", 
            "John Doe", 
            "12/25", 
            "123"
        );
        processor.setPaymentStrategy(creditCard);
        processor.processPayment(99.99);
        
        System.out.println("\n--- Example 2: PayPal Payment ---");
        // Change strategy to PayPal
        PaymentStrategy paypal = new PayPalPayment(
            "john.doe@example.com", 
            "password123"
        );
        processor.setPaymentStrategy(paypal);
        processor.processPayment(149.50);
        
        System.out.println("\n--- Example 3: Bank Transfer Payment ---");
        // Change strategy to bank transfer
        PaymentStrategy bankTransfer = new BankTransferPayment(
            "9876543210", 
            "Chase Bank", 
            "123456789"
        );
        processor.setPaymentStrategy(bankTransfer);
        processor.processPayment(250.00);
        
        System.out.println("\n--- Example 4: Processing Multiple Orders ---");
        // Different orders can use different payment strategies
        PaymentProcessor order1 = new PaymentProcessor("ORD-002");
        order1.setPaymentStrategy(new CreditCardPayment(
            "5555555555555555", 
            "Jane Smith", 
            "06/26", 
            "456"
        ));
        order1.processPayment(75.00);
        
        PaymentProcessor order2 = new PaymentProcessor("ORD-003");
        order2.setPaymentStrategy(new PayPalPayment(
            "jane.smith@example.com", 
            "securepass"
        ));
        order2.processPayment(200.00);
        
        System.out.println("\n=== Strategy Pattern Benefits Demonstrated ===");
        System.out.println("✓ Same PaymentProcessor can use different payment methods");
        System.out.println("✓ Payment strategies can be changed at runtime");
        System.out.println("✓ Easy to add new payment methods without modifying existing code");
        System.out.println("✓ Each payment method is encapsulated in its own class");
    }
}

