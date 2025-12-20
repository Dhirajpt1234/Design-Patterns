package Java.strategy_pattern.PaymentSystem;

/**
 * PaymentStrategy Interface
 * 
 * Defines the contract for all payment strategies.
 * Each concrete strategy must implement the processPayment method.
 */
public interface PaymentStrategy {
    /**
     * Process a payment with the given amount
     * 
     * @param amount The amount to be paid
     * @return true if payment was successful, false otherwise
     */
    boolean processPayment(double amount);
    
    /**
     * Get the name of the payment method
     * 
     * @return String representation of the payment method
     */
    String getPaymentMethod();
}

