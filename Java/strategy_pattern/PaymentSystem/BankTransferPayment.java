package Java.strategy_pattern.PaymentSystem;

/**
 * BankTransferPayment - Concrete Strategy
 * 
 * Implements payment processing using bank transfer.
 */
public class BankTransferPayment implements PaymentStrategy {
    private String accountNumber;
    private String bankName;
    private String routingNumber;
    
    public BankTransferPayment(String accountNumber, String bankName, 
                               String routingNumber) {
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.routingNumber = routingNumber;
    }
    
    @Override
    public boolean processPayment(double amount) {
        // Simulate bank transfer processing
        System.out.println("Processing bank transfer...");
        System.out.println("Bank: " + bankName);
        System.out.println("Account Number: " + maskAccountNumber(accountNumber));
        System.out.println("Routing Number: " + routingNumber);
        System.out.println("Amount: $" + String.format("%.2f", amount));
        
        // Simulate validation and processing
        if (validateBankAccount()) {
            System.out.println("✓ Bank transfer initiated successfully!");
            System.out.println("  (Note: Bank transfers may take 1-3 business days)");
            return true;
        } else {
            System.out.println("✗ Bank transfer failed!");
            return false;
        }
    }
    
    @Override
    public String getPaymentMethod() {
        return "Bank Transfer";
    }
    
    private boolean validateBankAccount() {
        // Simulate bank account validation
        return accountNumber != null && accountNumber.length() >= 8 &&
               bankName != null && !bankName.isEmpty() &&
               routingNumber != null && routingNumber.length() == 9;
    }
    
    private String maskAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.length() < 4) {
            return "****";
        }
        return "****" + accountNumber.substring(accountNumber.length() - 4);
    }
}

