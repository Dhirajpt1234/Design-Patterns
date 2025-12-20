package Java.template_method_pattern.ReportGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Concrete implementation of ReportGenerator for HTML reports.
 * Implements all abstract methods defined in the base class.
 */
public class HTMLReport extends ReportGenerator {
    
    public HTMLReport(String reportName) {
        super(reportName);
    }
    
    /**
     * Fetches data for HTML report from API or web service
     */
    @Override
    protected void fetchData() {
        System.out.println("🌐 Fetching data from REST API for HTML report...");
        // Simulate fetching data from API
        data = new ArrayList<>();
        Map<String, Object> record1 = new HashMap<>();
        record1.put("id", 1);
        record1.put("product", "Laptop");
        record1.put("quantity", 15);
        record1.put("price", 999.99);
        
        Map<String, Object> record2 = new HashMap<>();
        record2.put("id", 2);
        record2.put("product", "Mouse");
        record2.put("quantity", 50);
        record2.put("price", 29.99);
        
        Map<String, Object> record3 = new HashMap<>();
        record3.put("id", 3);
        record3.put("product", "Keyboard");
        record3.put("quantity", 30);
        record3.put("price", 79.99);
        
        data.add(record1);
        data.add(record2);
        data.add(record3);
        
        displayData();
    }
    
    /**
     * Formats data specifically for HTML format
     */
    @Override
    protected void formatData() {
        System.out.println("🎨 Formatting data for HTML format...");
        System.out.println("   - Creating HTML structure (<html>, <head>, <body>)");
        System.out.println("   - Applying CSS styles and Bootstrap framework");
        System.out.println("   - Generating HTML tables with responsive design");
        System.out.println("   - Adding interactive elements and JavaScript");
    }
    
    /**
     * Saves the report as an HTML file
     */
    @Override
    protected void saveReport() {
        System.out.println("💾 Saving report as HTML file: " + reportName + ".html");
        System.out.println("   - File size: 12 KB");
        System.out.println("   - Embedded CSS and JavaScript");
        System.out.println("   - Location: /reports/html/" + reportName + ".html");
    }
    
    /**
     * Override hook method to add HTML-specific footer
     */
    @Override
    protected void addFooter() {
        System.out.println("📌 Adding HTML footer with links and social media icons");
    }
}

