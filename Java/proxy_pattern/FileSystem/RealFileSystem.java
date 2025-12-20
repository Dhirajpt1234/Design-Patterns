package Java.proxy_pattern.FileSystem;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Real implementation of the file system.
 * This class provides the actual file reading functionality.
 * 
 * In a real-world scenario, this might be a complex system with
 * expensive operations, network calls, or security concerns.
 */
public class RealFileSystem implements IFileSystem {
    
    /**
     * Reads a file from the file system.
     * 
     * @param filePath The path to the file
     * @return The contents of the file
     * @throws IOException If the file cannot be read
     */
    @Override
    public String readFile(String filePath) throws IOException {
        System.out.println("RealFileSystem: Reading file from disk: " + filePath);
        // In a real implementation, this might be an expensive operation
        // (e.g., network call, database query, etc.)
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}

