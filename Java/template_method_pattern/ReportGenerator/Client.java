package Java.template_method_pattern.ReportGenerator;

/**
 * Client class to demonstrate the Template Method Pattern
 * 
 * TEMPLATE METHOD PATTERN EXPLANATION:
 * ====================================
 * The Template Method Pattern defines the skeleton of an algorithm in a method,
 * deferring some steps to subclasses. Template Method lets subclasses redefine
 * certain steps of an algorithm without changing the algorithm's structure.
 * 
 * Key Components:
 * 1. Abstract Class (ReportGenerator) - Defines the template method and abstract operations
 * 2. Template Method (generateReport) - Defines the algorithm structure (final method)
 * 3. Abstract Methods - Must be implemented by subclasses (fetchData, formatData, saveReport)
 * 4. Hook Methods - Optional methods that subclasses can override (validateData, addFooter)
 * 5. Concrete Classes - Implement the abstract methods (PDFReport, HTMLReport, CSVReport)
 * 
 * Benefits:
 * - Code Reuse: Common algorithm structure is defined once in the base class
 * - Consistency: All subclasses follow the same algorithm structure
 * - Flexibility: Subclasses can customize specific steps
 * - Maintainability: Changes to algorithm structure only need to be made in one place
 * - Follows Hollywood Principle: "Don't call us, we'll call you"
 * 
 * Use Cases:
 * - Report generation systems
 * - Data processing pipelines
 * - Build processes (compile, test, package)
 * - Game loops (initialize, play, cleanup)
 * - Web frameworks (request handling pipeline)
 * - Test frameworks (setup, test, teardown)
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=== TEMPLATE METHOD PATTERN DEMONSTRATION ===\n");
        
        System.out.println("--- Example 1: PDF Report Generation ---");
        ReportGenerator pdfReport = new PDFReport("Sales_Report_Q1");
        pdfReport.generateReport();
        
        System.out.println("--- Example 2: HTML Report Generation ---");
        ReportGenerator htmlReport = new HTMLReport("Inventory_Report");
        htmlReport.generateReport();
        
        System.out.println("--- Example 3: CSV Report Generation ---");
        ReportGenerator csvReport = new CSVReport("Employee_Report");
        csvReport.generateReport();
        
        System.out.println("=== Template Method Pattern Benefits Demonstrated ===");
        System.out.println("✓ All reports follow the same generation algorithm structure");
        System.out.println("✓ Each report type implements steps differently (fetchData, formatData, saveReport)");
        System.out.println("✓ Hook methods allow optional customization (addFooter)");
        System.out.println("✓ Algorithm structure is defined once and reused across all report types");
        System.out.println("✓ Easy to add new report types by extending ReportGenerator");
        System.out.println("✓ Changes to algorithm structure only need to be made in base class");
        
        System.out.println("\n=== Algorithm Structure (Template Method) ===");
        System.out.println("1. fetchData()      - Abstract (must implement)");
        System.out.println("2. validateData()   - Hook (optional override)");
        System.out.println("3. formatData()     - Abstract (must implement)");
        System.out.println("4. addFooter()      - Hook (optional override)");
        System.out.println("5. saveReport()     - Abstract (must implement)");
    }
}

