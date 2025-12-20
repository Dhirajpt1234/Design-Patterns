# Template Method Pattern - Report Generator Example

## Overview
This example demonstrates the Template Method Pattern using a report generation system. The system can generate different types of reports (PDF, HTML, CSV) that all follow the same algorithm structure but implement specific steps differently.

## Pattern Structure

### Components

1. **ReportGenerator Abstract Class** (`ReportGenerator.java`)
   - Defines the template method `generateReport()` that outlines the algorithm structure
   - Contains abstract methods that subclasses must implement: `fetchData()`, `formatData()`, `saveReport()`
   - Contains hook methods that subclasses can optionally override: `validateData()`, `addFooter()`
   - The template method is `final` to prevent subclasses from changing the algorithm structure

2. **PDFReport Class** (`PDFReport.java`) - Concrete Implementation
   - Implements all abstract methods for PDF report generation
   - Fetches data from database
   - Formats data for PDF with styling and layout
   - Saves report as PDF file
   - Overrides `addFooter()` hook method to add PDF-specific footer

3. **HTMLReport Class** (`HTMLReport.java`) - Concrete Implementation
   - Implements all abstract methods for HTML report generation
   - Fetches data from REST API
   - Formats data for HTML with CSS and JavaScript
   - Saves report as HTML file
   - Overrides `addFooter()` hook method to add HTML-specific footer

4. **CSVReport Class** (`CSVReport.java`) - Concrete Implementation
   - Implements all abstract methods for CSV report generation
   - Fetches data from CSV file
   - Formats data as comma-separated values
   - Saves report as CSV file
   - Uses default implementation of hook methods (no footer)

5. **Client Class** (`Client.java`)
   - Demonstrates the pattern in action
   - Shows how different report types follow the same algorithm structure
   - Demonstrates the use of abstract methods and hook methods

## How to Run

```bash
# Compile all Java files
javac Java/template_method_pattern/ReportGenerator/*.java

# Run the client
java Java.template_method_pattern.ReportGenerator.Client
```

## Expected Output

The program will:
1. Generate PDF reports following the template method algorithm
2. Generate HTML reports following the same algorithm structure
3. Generate CSV reports following the same algorithm structure
4. Demonstrate that all report types follow the same steps but implement them differently
5. Show how hook methods allow optional customization

## Algorithm Structure (Template Method)

The `generateReport()` template method defines the following algorithm:

1. **fetchData()** - Abstract method (must be implemented)
   - Each report type fetches data from different sources
   - PDF: Database
   - HTML: REST API
   - CSV: File system

2. **validateData()** - Hook method (optional override)
   - Default implementation validates data availability
   - Subclasses can override for custom validation

3. **formatData()** - Abstract method (must be implemented)
   - Each report type formats data differently
   - PDF: Applies styling, fonts, tables, charts
   - HTML: Creates HTML structure, CSS, JavaScript
   - CSV: Converts to comma-separated values

4. **addFooter()** - Hook method (optional override)
   - Default implementation does nothing
   - PDF and HTML reports override to add footers
   - CSV report uses default (no footer)

5. **saveReport()** - Abstract method (must be implemented)
   - Each report type saves in its specific format
   - PDF: Saves as .pdf file
   - HTML: Saves as .html file
   - CSV: Saves as .csv file

## Key Benefits

- **Code Reuse**: Common algorithm structure is defined once in the base class
- **Consistency**: All subclasses follow the same algorithm structure
- **Flexibility**: Subclasses can customize specific steps
- **Maintainability**: Changes to algorithm structure only need to be made in one place
- **Hollywood Principle**: "Don't call us, we'll call you" - base class controls the flow
- **Open/Closed Principle**: Open for extension (new report types), closed for modification (algorithm structure)

## Real-World Applications

- **Report Generation Systems**: Different report formats (PDF, HTML, CSV, Excel)
- **Data Processing Pipelines**: ETL processes with different data sources
- **Build Processes**: Compile, test, package steps that vary by project type
- **Game Loops**: Initialize, play, cleanup steps that vary by game type
- **Web Frameworks**: Request handling pipeline (authentication, authorization, processing, response)
- **Test Frameworks**: Setup, test execution, teardown steps
- **Document Processing**: Parse, validate, transform, save steps
- **Workflow Engines**: Define workflow steps, allow customization of individual steps

## Design Principles Demonstrated

1. **Template Method Pattern**: Defines algorithm skeleton, defers steps to subclasses
2. **Open/Closed Principle**: Open for extension (new report types), closed for modification (algorithm)
3. **Hollywood Principle**: Base class controls the flow, subclasses implement details
4. **Single Responsibility Principle**: Each concrete class handles one report type
5. **Dependency Inversion**: High-level modules depend on abstractions (ReportGenerator)

## Comparison with Other Patterns

- **Strategy Pattern**: Strategy pattern allows changing the entire algorithm at runtime, while Template Method fixes the algorithm structure and only allows changing specific steps
- **Factory Method Pattern**: Factory Method creates objects, Template Method defines algorithms
- **Builder Pattern**: Builder constructs objects step by step, Template Method defines algorithm steps

## Extending the Example

To add a new report type (e.g., ExcelReport):

1. Create a new class extending `ReportGenerator`
2. Implement abstract methods: `fetchData()`, `formatData()`, `saveReport()`
3. Optionally override hook methods: `validateData()`, `addFooter()`
4. The new report type will automatically follow the same algorithm structure

```java
public class ExcelReport extends ReportGenerator {
    public ExcelReport(String reportName) {
        super(reportName);
    }
    
    @Override
    protected void fetchData() {
        // Fetch data for Excel
    }
    
    @Override
    protected void formatData() {
        // Format data for Excel
    }
    
    @Override
    protected void saveReport() {
        // Save as Excel file
    }
}
```

