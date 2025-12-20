package Java.chain_of_responsibility.ExpenseApproval;

/**
 * Client class to demonstrate the Chain of Responsibility Pattern
 * 
 * CHAIN OF RESPONSIBILITY PATTERN EXPLANATION:
 * ============================================
 * The Chain of Responsibility Pattern passes a request along a chain of handlers.
 * Each handler decides either to process the request or to pass it to the next handler
 * in the chain. This decouples the sender of a request from its receivers.
 * 
 * Key Components:
 * 1. Handler (ApprovalHandler) - Abstract base class that defines the interface for handling requests
 * 2. Concrete Handlers (TeamLead, Manager, Director, CEO) - Implement specific handling logic
 * 3. Request (ExpenseRequest) - The object that needs to be processed
 * 4. Client - Creates the chain and initiates requests
 * 
 * Benefits:
 * - Decoupling: Sender doesn't need to know which handler will process the request
 * - Flexibility: Can add, remove, or reorder handlers dynamically
 * - Single Responsibility: Each handler has a single responsibility
 * - Open/Closed Principle: Can add new handlers without modifying existing code
 * 
 * Use Cases:
 * - Approval workflows (expense approval, leave requests, purchase orders)
 * - Event handling systems (GUI event propagation)
 * - Middleware in web frameworks (Express.js, Spring)
 * - Exception handling (try-catch chains)
 * - Logging systems (different log levels)
 * - Validation chains (input validation, authentication, authorization)
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=== CHAIN OF RESPONSIBILITY PATTERN DEMONSTRATION ===\n");
        
        // Create the chain of handlers
        ApprovalHandler teamLead = new TeamLead();
        ApprovalHandler manager = new Manager();
        ApprovalHandler director = new Director();
        ApprovalHandler ceo = new CEO();
        
        // Build the chain: TeamLead -> Manager -> Director -> CEO
        teamLead.setNext(manager);
        manager.setNext(director);
        director.setNext(ceo);
        
        System.out.println("Approval Chain: Team Lead -> Manager -> Director -> CEO\n");
        System.out.println("Approval Limits:");
        System.out.println("  - Team Lead: Up to $100");
        System.out.println("  - Manager: Up to $500");
        System.out.println("  - Director: Up to $2,000");
        System.out.println("  - CEO: Unlimited\n");
        System.out.println("=".repeat(60) + "\n");
        
        // Create various expense requests
        ExpenseRequest request1 = new ExpenseRequest("John Doe", "Office supplies", 50.0);
        ExpenseRequest request2 = new ExpenseRequest("Jane Smith", "Team lunch", 150.0);
        ExpenseRequest request3 = new ExpenseRequest("Bob Johnson", "Conference registration", 800.0);
        ExpenseRequest request4 = new ExpenseRequest("Alice Williams", "Equipment purchase", 2500.0);
        ExpenseRequest request5 = new ExpenseRequest("Charlie Brown", "Coffee", 5.0);
        ExpenseRequest request6 = new ExpenseRequest("Diana Prince", "Company retreat", 15000.0);
        
        // Process requests through the chain
        System.out.println("--- Processing Request 1: $50 ---");
        teamLead.handleRequest(request1);
        System.out.println();
        
        System.out.println("--- Processing Request 2: $150 ---");
        teamLead.handleRequest(request2);
        System.out.println();
        
        System.out.println("--- Processing Request 3: $800 ---");
        teamLead.handleRequest(request3);
        System.out.println();
        
        System.out.println("--- Processing Request 4: $2,500 ---");
        teamLead.handleRequest(request4);
        System.out.println();
        
        System.out.println("--- Processing Request 5: $5 ---");
        teamLead.handleRequest(request5);
        System.out.println();
        
        System.out.println("--- Processing Request 6: $15,000 ---");
        teamLead.handleRequest(request6);
        System.out.println();
        
        System.out.println("=== Chain of Responsibility Pattern Benefits Demonstrated ===");
        System.out.println("✓ Requests are automatically routed to the appropriate handler");
        System.out.println("✓ Handlers are decoupled - each only knows about the next handler");
        System.out.println("✓ Easy to add new handlers or modify the chain order");
        System.out.println("✓ Client doesn't need to know which handler will process the request");
        System.out.println("✓ Each handler has a single responsibility (approval limit)");
        System.out.println("✓ Follows Open/Closed Principle - open for extension, closed for modification");
    }
}

