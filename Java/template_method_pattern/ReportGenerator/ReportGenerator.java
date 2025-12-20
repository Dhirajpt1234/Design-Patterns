package Java.template_method_pattern.ReportGenerator;

import java.util.List;
import java.util.Map;

/**
 * Abstract base class that defines the template method for report generation.
 * 
 * TEMPLATE METHOD PATTERN:
 * =======================
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
 */
public abstract class ReportGenerator {
    protected String reportName;
    protected List<Map<String, Object>> data;
    
    public ReportGenerator(String reportName) {
        this.reportName = reportName;
    }
    
    /**
     * Template Method - Defines the skeleton of the algorithm.
     * This method is final to prevent subclasses from changing the algorithm structure.
     */
    public final void generateReport() {
        System.out.println("=== Starting Report Generation: " + reportName + " ===");
        
        // Step 1: Fetch data (abstract - must be implemented by subclasses)
        fetchData();
        
        // Step 2: Validate data (hook method - optional override)
        if (validateData()) {
            System.out.println("✓ Data validation passed");
        } else {
            System.out.println("⚠ Data validation failed, but continuing...");
        }
        
        // Step 3: Format data (abstract - must be implemented by subclasses)
        formatData();
        
        // Step 4: Add footer (hook method - optional override)
        addFooter();
        
        // Step 5: Save report (abstract - must be implemented by subclasses)
        saveReport();
        
        System.out.println("=== Report Generation Complete ===\n");
    }
    
    /**
     * Abstract method - Must be implemented by subclasses.
     * Each report type will fetch data differently.
     */
    protected abstract void fetchData();
    
    /**
     * Abstract method - Must be implemented by subclasses.
     * Each report type will format data differently.
     */
    protected abstract void formatData();
    
    /**
     * Abstract method - Must be implemented by subclasses.
     * Each report type will save the report differently.
     */
    protected abstract void saveReport();
    
    /**
     * Hook method - Optional method that subclasses can override.
     * Provides default validation behavior.
     */
    protected boolean validateData() {
        if (data == null || data.isEmpty()) {
            System.out.println("⚠ Warning: No data available for report");
            return false;
        }
        return true;
    }
    
    /**
     * Hook method - Optional method that subclasses can override.
     * Provides default footer behavior (no footer by default).
     */
    protected void addFooter() {
        // Default implementation - no footer
        // Subclasses can override to add custom footers
    }
    
    /**
     * Helper method to display report data
     */
    protected void displayData() {
        if (data != null && !data.isEmpty()) {
            System.out.println("Data contains " + data.size() + " records");
        }
    }
}

