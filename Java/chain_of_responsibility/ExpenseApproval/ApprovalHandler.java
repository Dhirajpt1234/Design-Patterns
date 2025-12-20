package Java.chain_of_responsibility.ExpenseApproval;

/**
 * Abstract base class for all approval handlers in the chain.
 * This class implements the Chain of Responsibility pattern by:
 * 1. Maintaining a reference to the next handler in the chain
 * 2. Providing a template method (handleRequest) that processes the request
 * 3. Delegating to the next handler if the current handler cannot process the request
 */
public abstract class ApprovalHandler {
    protected ApprovalHandler nextHandler;
    protected String handlerName;
    protected double approvalLimit;

    public ApprovalHandler(String handlerName, double approvalLimit) {
        this.handlerName = handlerName;
        this.approvalLimit = approvalLimit;
    }

    /**
     * Sets the next handler in the chain
     */
    public void setNext(ApprovalHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * Template method that defines the algorithm for handling requests.
     * This method can be overridden if needed, but typically subclasses
     * only need to override canHandle() and processRequest().
     */
    public void handleRequest(ExpenseRequest request) {
        if (canHandle(request)) {
            processRequest(request);
        } else if (nextHandler != null) {
            System.out.println(handlerName + " cannot approve. Forwarding to next level...");
            nextHandler.handleRequest(request);
        } else {
            // End of chain - no one can handle the request
            request.setStatus("Rejected - No approval authority found");
            System.out.println("Request cannot be processed. No handler in the chain can approve this expense.");
        }
    }

    /**
     * Determines if this handler can process the request.
     * Subclasses must implement this method.
     */
    protected abstract boolean canHandle(ExpenseRequest request);

    /**
     * Processes the request if this handler can handle it.
     * Subclasses must implement this method.
     */
    protected abstract void processRequest(ExpenseRequest request);
}

