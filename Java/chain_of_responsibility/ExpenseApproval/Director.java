package Java.chain_of_responsibility.ExpenseApproval;

/**
 * Director handler - Can approve expenses up to $2000
 */
public class Director extends ApprovalHandler {
    
    public Director() {
        super("Director", 2000.0);
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

