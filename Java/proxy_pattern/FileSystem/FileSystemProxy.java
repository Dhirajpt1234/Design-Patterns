package Java.proxy_pattern.FileSystem;

import java.io.IOException;

/**
 * Proxy class that controls access to the RealFileSystem.
 * 
 * This proxy adds additional functionality:
 * 1. Access control - Only allows reading markdown files (.md or .MD)
 * 2. Caching - Could cache file contents (not implemented in this example)
 * 3. Logging - Logs all file access attempts
 * 4. Lazy loading - Only creates the RealFileSystem when needed
 * 
 * PROXY PATTERN:
 * The proxy acts as a surrogate or placeholder for another object
 * to control access to it. It implements the same interface as the
 * real object, allowing it to be used interchangeably.
 */
public class FileSystemProxy implements IFileSystem {
    private RealFileSystem realFileSystem;
    private static final String ALLOWED_EXTENSION = ".md";
    
    /**
     * Reads a file, but only if it's a markdown file.
     * 
     * @param filePath The path to the file
     * @return The contents of the file
     * @throws IOException If the file cannot be read or is not a markdown file
     */
    @Override
    public String readFile(String filePath) throws IOException {
        // Access control: Only allow markdown files
        if (!filePath.toLowerCase().endsWith(ALLOWED_EXTENSION)) {
            String error = "FileSystemProxy: Access denied! Can only read Markdown files (.md). Attempted: " + filePath;
            System.out.println(error);
            throw new IOException(error);
        }
        
        // Lazy initialization: Create RealFileSystem only when needed
        if (realFileSystem == null) {
            System.out.println("FileSystemProxy: Creating RealFileSystem instance (lazy loading)");
            realFileSystem = new RealFileSystem();
        }
        
        // Logging: Log the access attempt
        System.out.println("FileSystemProxy: Access granted for markdown file: " + filePath);
        
        // Delegate to the real file system
        return realFileSystem.readFile(filePath);
    }
}

