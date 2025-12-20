# Proxy Pattern Example - File System Proxy

## Overview
This example demonstrates the **Proxy Pattern** using a File System Proxy. The proxy controls access to the real file system, only allowing markdown files to be read. It also demonstrates lazy loading of the real file system object.

## How to Run

### Compile and Run
```bash
cd Java/proxy_pattern/FileSystem

# Compile all Java files
javac *.java

# Run the Client
java Client
```

### Or compile and run in one command
```bash
cd Java/proxy_pattern/FileSystem
javac *.java && java Client
```

## What You'll See

The program demonstrates:
1. **Access Control** - The proxy only allows reading markdown files (.md)
2. **Lazy Loading** - The RealFileSystem is only created when first needed
3. **Access Denied** - Attempts to read non-markdown files are blocked
4. **Transparent Usage** - The client uses the same interface for both proxy and real object

## Key Learning Points

- **Proxy Pattern** provides a surrogate or placeholder for another object
- The proxy implements the same interface as the real object
- Proxy can add functionality (access control, logging, caching) without modifying the real object
- Proxy controls access to the real object
- Client code doesn't need to know about the proxy - it uses the interface

## Structure

- `IFileSystem.java` - Interface that both proxy and real object implement
- `RealFileSystem.java` - The actual file system implementation
- `FileSystemProxy.java` - The proxy that controls access to RealFileSystem
- `Client.java` - Demonstrates the pattern usage

## Proxy Pattern Benefits

1. **Access Control** - Restrict access to the real object
2. **Lazy Loading** - Delay creation of expensive objects until needed
3. **Caching** - Cache results to improve performance
4. **Logging** - Add logging without modifying the real object
5. **Security** - Add security checks before accessing the real object

## Real-World Use Cases

- Virtual Proxy: Delay loading of expensive resources (images, large files)
- Protection Proxy: Control access based on permissions
- Remote Proxy: Represent objects in different address spaces
- Smart Reference: Add additional functionality (reference counting, loading)

