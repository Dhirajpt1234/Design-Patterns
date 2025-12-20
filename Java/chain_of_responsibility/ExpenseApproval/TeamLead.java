package Java.chain_of_responsibility.ExpenseApproval;

/**
 * TeamLead handler - Can approve expenses up to $100
 */
public class TeamLead extends ApprovalHandler {
    
    public TeamLead() {
        super("Team Lead", 100.0);
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

