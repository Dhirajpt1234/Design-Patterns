package Java.strategy_pattern.PaymentSystem;

/**
 * PayPalPayment - Concrete Strategy
 * 
 * Implements payment processing using PayPal.
 */
public class PayPalPayment implements PaymentStrategy {
    private String email;
    private String password;
    
    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }
    
    @Override
    public boolean processPayment(double amount) {
        // Simulate PayPal payment processing
        System.out.println("Processing PayPal payment...");
        System.out.println("PayPal Account: " + email);
        System.out.println("Amount: $" + String.format("%.2f", amount));
        
        // Simulate validation and processing
        if (validatePayPalAccount()) {
            System.out.println("✓ PayPal payment successful!");
            return true;
        } else {
            System.out.println("✗ PayPal payment failed!");
            return false;
        }
    }
    
    @Override
    public String getPaymentMethod() {
        return "PayPal";
    }
    
    private boolean validatePayPalAccount() {
        // Simulate PayPal account validation
        return email != null && email.contains("@") && 
               password != null && password.length() >= 6;
    }
}

