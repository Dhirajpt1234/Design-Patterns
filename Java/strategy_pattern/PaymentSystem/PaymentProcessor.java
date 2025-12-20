package Java.strategy_pattern.PaymentSystem;

/**
 * PaymentProcessor - Context Class
 * 
 * Uses a PaymentStrategy to process payments.
 * The strategy can be changed at runtime, allowing the same
 * PaymentProcessor to use different payment methods.
 */
public class PaymentProcessor {
    private PaymentStrategy paymentStrategy;
    private String orderId;
    
    public PaymentProcessor(String orderId) {
        this.orderId = orderId;
    }
    
    /**
     * Set the payment strategy to use
     * 
     * @param strategy The payment strategy to use
     */
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }
    
    /**
     * Process a payment using the current strategy
     * 
     * @param amount The amount to be paid
     * @return true if payment was successful, false otherwise
     */
    public boolean processPayment(double amount) {
        if (paymentStrategy == null) {
            System.out.println("Error: No payment strategy selected!");
            return false;
        }
        
        System.out.println("\n--- Processing Order: " + orderId + " ---");
        System.out.println("Payment Method: " + paymentStrategy.getPaymentMethod());
        
        boolean result = paymentStrategy.processPayment(amount);
        
        if (result) {
            System.out.println("Order " + orderId + " payment completed successfully!");
        } else {
            System.out.println("Order " + orderId + " payment failed!");
        }
        
        return result;
    }
    
    /**
     * Get the current payment strategy
     * 
     * @return The current payment strategy
     */
    public PaymentStrategy getPaymentStrategy() {
        return paymentStrategy;
    }
}

