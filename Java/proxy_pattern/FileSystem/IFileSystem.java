package Java.proxy_pattern.FileSystem;

import java.io.IOException;

/**
 * Interface for file system operations.
 * This interface defines the contract for reading files.
 */
public interface IFileSystem {
    /**
     * Reads the contents of a file.
     * 
     * @param filePath The path to the file to read
     * @return The contents of the file as a String
     * @throws IOException If an I/O error occurs
     */
    String readFile(String filePath) throws IOException;
}

