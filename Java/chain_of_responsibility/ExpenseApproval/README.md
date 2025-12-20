# Chain of Responsibility Pattern - Expense Approval System Example

## Overview
This example demonstrates the Chain of Responsibility Pattern using an expense approval system. Different managers (Team Lead, Manager, Director, CEO) form a chain where each can approve expenses up to a certain limit. If a handler cannot approve a request, it passes it to the next handler in the chain.

## Pattern Structure

### Components

1. **ApprovalHandler Class** (`ApprovalHandler.java`) - Abstract Handler
   - Defines the interface for handling requests
   - Maintains a reference to the next handler in the chain
   - Implements the template method `handleRequest()` that processes requests
   - Contains abstract methods `canHandle()` and `processRequest()` that subclasses must implement

2. **TeamLead Class** (`TeamLead.java`) - Concrete Handler
   - Can approve expenses up to $100
   - If amount exceeds limit, forwards to next handler

3. **Manager Class** (`Manager.java`) - Concrete Handler
   - Can approve expenses up to $500
   - If amount exceeds limit, forwards to next handler

4. **Director Class** (`Director.java`) - Concrete Handler
   - Can approve expenses up to $2,000
   - If amount exceeds limit, forwards to next handler

5. **CEO Class** (`CEO.java`) - Concrete Handler
   - Can approve any expense amount (unlimited)
   - Acts as the final handler in the chain

6. **ExpenseRequest Class** (`ExpenseRequest.java`) - Request Object
   - Represents an expense request that needs approval
   - Contains employee name, description, amount, and status

7. **Client Class** (`Client.java`)
   - Creates and configures the chain of handlers
   - Initiates requests and demonstrates the pattern in action

## How to Run

## Expected Output

The program will:
1. Create a chain of approval handlers (Team Lead → Manager → Director → CEO)
2. Process various expense requests with different amounts
3. Show how requests are automatically routed to the appropriate handler
4. Demonstrate forwarding when a handler cannot process a request
5. Show approval at different levels based on the expense amount

## Key Benefits

- **Decoupling**: The sender (client) doesn't need to know which handler will process the request
- **Flexibility**: Can add, remove, or reorder handlers dynamically without changing client code
- **Single Responsibility**: Each handler has one responsibility (approval limit)
- **Open/Closed Principle**: Can add new handlers without modifying existing code
- **Dynamic Chain**: Chain can be configured at runtime
- **Request Routing**: Automatic routing to the appropriate handler

## Real-World Applications

- **Approval Workflows**: Expense approval, leave requests, purchase orders, document approval
- **Event Handling**: GUI event propagation (button → panel → window → application)
- **Middleware**: Web framework middleware chains (Express.js, Spring, ASP.NET)
- **Exception Handling**: Try-catch chains, error handling pipelines
- **Logging Systems**: Different log levels (DEBUG → INFO → WARN → ERROR)
- **Validation Chains**: Input validation, authentication, authorization
- **Customer Support**: Tiered support system (Level 1 → Level 2 → Level 3)
- **Network Protocols**: Request routing through multiple layers
- **Game Development**: Event handling and collision detection chains

## Design Principles Demonstrated

1. **Chain of Responsibility Pattern**: Passes requests along a chain of handlers
2. **Single Responsibility Principle**: Each handler has one responsibility
3. **Open/Closed Principle**: Open for extension (new handlers), closed for modification
4. **Template Method Pattern**: `handleRequest()` defines the algorithm structure
5. **Loose Coupling**: Handlers are loosely coupled - only know about the next handler

## Pattern Variations

1. **Pure Chain**: Each handler either processes or forwards (no partial processing)
2. **Chain with Processing**: Handlers can partially process before forwarding
3. **Dynamic Chain**: Chain can be modified at runtime
4. **Multiple Chains**: Different chains for different request types
5. **Chain with Default Handler**: Always has a final handler that processes all remaining requests

## Comparison with Other Patterns

- **vs Strategy Pattern**: Chain of Responsibility routes requests to handlers, Strategy swaps algorithms
- **vs Command Pattern**: Chain processes requests through multiple handlers, Command encapsulates requests
- **vs Decorator Pattern**: Chain forwards to next handler, Decorator wraps and enhances functionality
- **vs State Pattern**: Chain changes based on handler capability, State changes based on object state

