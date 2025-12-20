package Java.proxy_pattern.FileSystem;

import java.io.IOException;

/**
 * Client class to demonstrate the Proxy Pattern
 * 
 * PROXY PATTERN EXPLANATION:
 * ==========================
 * The Proxy Pattern provides a surrogate or placeholder for another object
 * to control access to it. The proxy implements the same interface as the
 * real object, allowing it to be used interchangeably.
 * 
 * Key Components:
 * 1. Subject (IFileSystem) - The interface that both proxy and real object implement
 * 2. RealSubject (RealFileSystem) - The actual object that performs the work
 * 3. Proxy (FileSystemProxy) - Controls access to the real object
 * 
 * Benefits:
 * - Access control: Restrict access to the real object
 * - Lazy loading: Delay creation of expensive objects until needed
 * - Caching: Cache results to improve performance
 * - Logging: Add logging without modifying the real object
 * - Security: Add security checks before accessing the real object
 * 
 * Use Cases:
 * - When you need to control access to an object
 * - When you want to add functionality (logging, caching) without modifying the real object
 * - When the real object is expensive to create or access
 * - When you need to add security or validation checks
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=== PROXY PATTERN DEMONSTRATION ===\n");
        
        // Create the proxy (client doesn't know about RealFileSystem)
        IFileSystem fileSystem = new FileSystemProxy();
        
        // Try to read a markdown file (should succeed)
        System.out.println("--- Attempt 1: Reading Markdown File (Should Succeed) ---");
        try {
            String readmePath = "README.md";
            System.out.println("Attempting to read: " + readmePath);
            String content = fileSystem.readFile(readmePath);
            System.out.println("✓ Successfully read markdown file!");
            System.out.println("File content preview (first 100 chars): " + 
                             (content.length() > 100 ? content.substring(0, 100) + "..." : content) + "\n");
        } catch (IOException e) {
            System.out.println("✗ Error: " + e.getMessage() + "\n");
        }
        
        // Try to read a text file (should fail - access denied)
        System.out.println("--- Attempt 2: Reading Text File (Should Fail - Access Denied) ---");
        try {
            String txtPath = "document.txt";
            System.out.println("Attempting to read: " + txtPath);
            String content = fileSystem.readFile(txtPath);
            System.out.println("✓ Successfully read file!");
            System.out.println("Content: " + content + "\n");
        } catch (IOException e) {
            System.out.println("✗ " + e.getMessage() + "\n");
        }
        
        // Try to read a Java file (should fail - access denied)
        System.out.println("--- Attempt 3: Reading Java File (Should Fail - Access Denied) ---");
        try {
            String javaPath = "Client.java";
            System.out.println("Attempting to read: " + javaPath);
            String content = fileSystem.readFile(javaPath);
            System.out.println("✓ Successfully read file!");
            System.out.println("Content preview: " + 
                             (content.length() > 100 ? content.substring(0, 100) + "..." : content) + "\n");
        } catch (IOException e) {
            System.out.println("✗ " + e.getMessage() + "\n");
        }
        
        // Try to read another markdown file (should succeed if it exists, or show access granted)
        System.out.println("--- Attempt 4: Reading Another Markdown File (Should Succeed) ---");
        try {
            String anotherMdPath = "README.md"; // Using same file to ensure it exists
            System.out.println("Attempting to read: " + anotherMdPath);
            fileSystem.readFile(anotherMdPath); // Read file to demonstrate proxy behavior
            System.out.println("✓ Successfully read markdown file!");
            System.out.println("(Note: RealFileSystem was already created, so no lazy loading message)\n");
        } catch (IOException e) {
            System.out.println("✗ Error: " + e.getMessage() + "\n");
        }
        
        System.out.println("=== KEY TAKEAWAYS ===");
        System.out.println("1. Proxy controls access to RealFileSystem");
        System.out.println("2. Only markdown files are allowed (access control)");
        System.out.println("3. RealFileSystem is created lazily (only when needed)");
        System.out.println("4. Client uses IFileSystem interface (doesn't know about proxy)");
        System.out.println("5. Proxy adds functionality without modifying RealFileSystem");
    }
}

