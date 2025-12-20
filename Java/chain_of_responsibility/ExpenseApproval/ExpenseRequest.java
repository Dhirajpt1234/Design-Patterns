package Java.chain_of_responsibility.ExpenseApproval;

/**
 * ExpenseRequest class represents a request that needs to be processed
 * by the chain of handlers.
 */
public class ExpenseRequest {
    private String employeeName;
    private String description;
    private double amount;
    private String status;

    public ExpenseRequest(String employeeName, String description, double amount) {
        this.employeeName = employeeName;
        this.description = description;
        this.amount = amount;
        this.status = "Pending";
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("Expense Request: $%.2f - %s by %s [Status: %s]", 
            amount, description, employeeName, status);
    }
}

