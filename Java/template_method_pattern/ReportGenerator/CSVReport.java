package Java.template_method_pattern.ReportGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Concrete implementation of ReportGenerator for CSV reports.
 * Implements all abstract methods defined in the base class.
 */
public class CSVReport extends ReportGenerator {
    
    public CSVReport(String reportName) {
        super(reportName);
    }
    
    /**
     * Fetches data for CSV report from file system or CSV source
     */
    @Override
    protected void fetchData() {
        System.out.println("📁 Fetching data from CSV file for processing...");
        // Simulate fetching data from CSV
        data = new ArrayList<>();
        Map<String, Object> record1 = new HashMap<>();
        record1.put("employee_id", "E001");
        record1.put("name", "Alice Brown");
        record1.put("department", "Engineering");
        record1.put("salary", 75000);
        
        Map<String, Object> record2 = new HashMap<>();
        record2.put("employee_id", "E002");
        record2.put("name", "Charlie Davis");
        record2.put("department", "Marketing");
        record2.put("salary", 65000);
        
        Map<String, Object> record3 = new HashMap<>();
        record3.put("employee_id", "E003");
        record3.put("name", "Diana Wilson");
        record3.put("department", "Sales");
        record3.put("salary", 70000);
        
        data.add(record1);
        data.add(record2);
        data.add(record3);
        
        displayData();
    }
    
    /**
     * Formats data specifically for CSV format
     */
    @Override
    protected void formatData() {
        System.out.println("📋 Formatting data for CSV format...");
        System.out.println("   - Converting data to comma-separated values");
        System.out.println("   - Escaping special characters and quotes");
        System.out.println("   - Adding header row with column names");
        System.out.println("   - Ensuring proper encoding (UTF-8)");
    }
    
    /**
     * Saves the report as a CSV file
     */
    @Override
    protected void saveReport() {
        System.out.println("💾 Saving report as CSV file: " + reportName + ".csv");
        System.out.println("   - File size: 2 KB");
        System.out.println("   - Encoding: UTF-8");
        System.out.println("   - Location: /reports/csv/" + reportName + ".csv");
    }
    
    // Note: CSVReport does not override addFooter() hook method
    // It uses the default implementation (no footer)
}

