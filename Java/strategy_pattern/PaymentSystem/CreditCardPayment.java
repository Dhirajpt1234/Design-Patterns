package Java.strategy_pattern.PaymentSystem;

/**
 * CreditCardPayment - Concrete Strategy
 * 
 * Implements payment processing using credit card.
 */
public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private String cvv;
    
    public CreditCardPayment(String cardNumber, String cardHolderName, 
                            String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }
    
    @Override
    public boolean processPayment(double amount) {
        // Simulate credit card payment processing
        System.out.println("Processing credit card payment...");
        System.out.println("Card Number: " + maskCardNumber(cardNumber));
        System.out.println("Card Holder: " + cardHolderName);
        System.out.println("Amount: $" + String.format("%.2f", amount));
        
        // Simulate validation and processing
        if (validateCard()) {
            System.out.println("✓ Credit card payment successful!");
            return true;
        } else {
            System.out.println("✗ Credit card payment failed!");
            return false;
        }
    }
    
    @Override
    public String getPaymentMethod() {
        return "Credit Card";
    }
    
    private boolean validateCard() {
        // Simulate card validation
        return cardNumber != null && cardNumber.length() == 16 && 
               cvv != null && cvv.length() == 3 &&
               expiryDate != null && expiryDate.matches("\\d{2}/\\d{2}");
    }
    
    private String maskCardNumber(String cardNumber) {
        if (cardNumber == null || cardNumber.length() < 4) {
            return "****";
        }
        return "****-****-****-" + cardNumber.substring(cardNumber.length() - 4);
    }
}

