package Java.state_pattern.MediaPlayer;

/**
 * Client class to demonstrate the State Pattern
 * 
 * STATE PATTERN EXPLANATION:
 * ==========================
 * The State Pattern allows an object to alter its behavior when its internal state changes.
 * The object will appear to change its class. This pattern is particularly useful when an
 * object's behavior depends on its state and it must change its behavior at runtime based on that state.
 * 
 * Key Components:
 * 1. State Interface (State) - Defines the interface for encapsulating the behavior associated
 *    with a particular state of the Context
 * 2. Concrete States (PlayingState, PausedState, StoppedState) - Each class implements a
 *    behavior associated with a state of the Context
 * 3. Context (MediaPlayer) - Maintains an instance of a ConcreteState subclass that defines
 *    the current state and delegates state-specific behavior to the current State object
 * 
 * Benefits:
 * - Eliminates large conditional statements (if-else or switch-case) based on state
 * - Makes state transitions explicit and easier to understand
 * - Localizes state-specific behavior in separate classes
 * - Makes it easy to add new states and transitions
 * - Follows Single Responsibility Principle - each state class has one responsibility
 * - Follows Open/Closed Principle - can add new states without modifying existing code
 * 
 * Use Cases:
 * - Media players (playing, paused, stopped)
 * - Vending machines (idle, has money, dispensing, out of stock)
 * - Order processing (pending, processing, shipped, delivered)
 * - Game character states (idle, walking, running, jumping)
 * - Traffic lights (red, yellow, green)
 * - Document workflow (draft, review, approved, published)
 * - ATM machines (idle, card inserted, pin entered, transaction)
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=== STATE PATTERN DEMONSTRATION ===\n");
        System.out.println("=".repeat(60) + "\n");
        
        // Create a media player with an initial track
        MediaPlayer player = new MediaPlayer("Bohemian Rhapsody - Queen");
        
        System.out.println("--- Scenario 1: Starting from STOPPED state ---");
        player.displayStatus();
        
        // Try to pause when stopped (should fail)
        player.pause();
        System.out.println();
        
        // Start playing
        player.play();
        System.out.println();
        player.displayStatus();
        
        System.out.println("--- Scenario 2: Playing and pausing ---");
        // Pause the playback
        player.pause();
        System.out.println();
        player.displayStatus();
        
        // Try to play again when already playing (should show already playing)
        System.out.println("--- Scenario 3: Resuming from paused state ---");
        player.play();
        System.out.println();
        player.displayStatus();
        
        System.out.println("--- Scenario 4: Stopping playback ---");
        // Stop the playback
        player.stop();
        System.out.println();
        player.displayStatus();
        
        System.out.println("--- Scenario 5: Trying invalid operations ---");
        // Try to pause when stopped (should fail)
        player.pause();
        System.out.println();
        
        // Try to stop when already stopped
        player.stop();
        System.out.println();
        
        System.out.println("--- Scenario 6: Changing track and playing ---");
        player.setCurrentTrack("Stairway to Heaven - Led Zeppelin");
        player.play();
        System.out.println();
        player.displayStatus();
        
        System.out.println("--- Scenario 7: Complete playback cycle ---");
        player.pause();
        System.out.println();
        player.play();
        System.out.println();
        player.stop();
        System.out.println();
        player.displayStatus();
        
        System.out.println("=== State Pattern Benefits Demonstrated ===");
        System.out.println("✓ Behavior changes automatically based on state");
        System.out.println("✓ No large if-else or switch-case statements needed");
        System.out.println("✓ State transitions are explicit and clear");
        System.out.println("✓ Easy to add new states (e.g., BufferingState, ErrorState)");
        System.out.println("✓ Each state class encapsulates its own behavior");
        System.out.println("✓ Follows Single Responsibility Principle");
        System.out.println("✓ Follows Open/Closed Principle - open for extension, closed for modification");
        System.out.println("✓ State-specific behavior is localized in state classes");
    }
}

