package Java.template_method_pattern.ReportGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Concrete implementation of ReportGenerator for PDF reports.
 * Implements all abstract methods defined in the base class.
 */
public class PDFReport extends ReportGenerator {
    
    public PDFReport(String reportName) {
        super(reportName);
    }
    
    /**
     * Fetches data for PDF report from database or data source
     */
    @Override
    protected void fetchData() {
        System.out.println("📊 Fetching data from database for PDF report...");
        // Simulate fetching data
        data = new ArrayList<>();
        Map<String, Object> record1 = new HashMap<>();
        record1.put("id", 1);
        record1.put("name", "John Doe");
        record1.put("amount", 1500.00);
        record1.put("date", "2024-01-15");
        
        Map<String, Object> record2 = new HashMap<>();
        record2.put("id", 2);
        record2.put("name", "Jane Smith");
        record2.put("amount", 2300.50);
        record2.put("date", "2024-01-16");
        
        Map<String, Object> record3 = new HashMap<>();
        record3.put("id", 3);
        record3.put("name", "Bob Johnson");
        record3.put("amount", 980.75);
        record3.put("date", "2024-01-17");
        
        data.add(record1);
        data.add(record2);
        data.add(record3);
        
        displayData();
    }
    
    /**
     * Formats data specifically for PDF format
     */
    @Override
    protected void formatData() {
        System.out.println("📄 Formatting data for PDF format...");
        System.out.println("   - Applying PDF styling and layout");
        System.out.println("   - Setting fonts: Arial, Times New Roman");
        System.out.println("   - Creating tables and charts");
        System.out.println("   - Adding headers and page numbers");
    }
    
    /**
     * Saves the report as a PDF file
     */
    @Override
    protected void saveReport() {
        System.out.println("💾 Saving report as PDF file: " + reportName + ".pdf");
        System.out.println("   - File size: 245 KB");
        System.out.println("   - Pages: 3");
        System.out.println("   - Location: /reports/pdf/" + reportName + ".pdf");
    }
    
    /**
     * Override hook method to add PDF-specific footer
     */
    @Override
    protected void addFooter() {
        System.out.println("📌 Adding PDF footer with page numbers and copyright");
    }
}

