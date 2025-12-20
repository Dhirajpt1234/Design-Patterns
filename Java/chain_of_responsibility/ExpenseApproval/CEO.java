package Java.chain_of_responsibility.ExpenseApproval;

/**
 * CEO handler - Can approve any expense amount (no limit)
 */
public class CEO extends ApprovalHandler {
    
    public CEO() {
        super("CEO", Double.MAX_VALUE);
    }

    @Override
    protected boolean canHandle(ExpenseRequest request) {
        // CEO can handle any request
        return true;
    }

    @Override
    protected void processRequest(ExpenseRequest request) {
        request.setStatus("Approved");
        System.out.println(handlerName + " approved: " + request);
    }
}

