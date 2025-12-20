package Java.chain_of_responsibility.ExpenseApproval;

/**
 * Manager handler - Can approve expenses up to $500
 */
public class Manager extends ApprovalHandler {
    
    public Manager() {
        super("Manager", 500.0);
    }

    @Override
    protected boolean canHandle(ExpenseRequest request) {
        return request.getAmount() <= approvalLimit;
    }

    @Override
    protected void processRequest(ExpenseRequest request) {
        request.setStatus("Approved");
        System.out.println(handlerName + " approved: " + request);
    }
}

