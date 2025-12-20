package Java.state_pattern.MediaPlayer;

/**
 * Context class that maintains a reference to the current state.
 * The MediaPlayer delegates state-specific behavior to the current State object.
 * 
 * This is the "Context" in the State pattern:
 * - Maintains an instance of a State subclass that defines the current state
 * - Delegates state-specific requests to the current State object
 * - Changes state by setting a new State object
 */
public class MediaPlayer {
    private State currentState;
    private String currentTrack;
    
    /**
     * Constructor initializes the player in StoppedState
     */
    public MediaPlayer(String track) {
        this.currentTrack = track;
        this.currentState = new StoppedState();
        System.out.println("🎵 Media Player initialized with track: " + track);
        System.out.println("   Initial state: " + currentState.getStateName() + "\n");
    }
    
    /**
     * Changes the current state of the player
     * @param state The new state to transition to
     */
    public void setState(State state) {
        this.currentState = state;
    }
    
    /**
     * Gets the current state
     * @return The current State object
     */
    public State getCurrentState() {
        return currentState;
    }
    
    /**
     * Gets the current track name
     * @return The current track name
     */
    public String getCurrentTrack() {
        return currentTrack;
    }
    
    /**
     * Sets a new track
     * @param track The new track name
     */
    public void setCurrentTrack(String track) {
        this.currentTrack = track;
    }
    
    /**
     * Delegates play action to the current state
     */
    public void play() {
        System.out.println("📱 Action: PLAY (Current State: " + currentState.getStateName() + ")");
        currentState.play(this);
    }
    
    /**
     * Delegates pause action to the current state
     */
    public void pause() {
        System.out.println("📱 Action: PAUSE (Current State: " + currentState.getStateName() + ")");
        currentState.pause(this);
    }
    
    /**
     * Delegates stop action to the current state
     */
    public void stop() {
        System.out.println("📱 Action: STOP (Current State: " + currentState.getStateName() + ")");
        currentState.stop(this);
    }
    
    /**
     * Displays the current status of the player
     */
    public void displayStatus() {
        System.out.println("\n📊 Player Status:");
        System.out.println("   Track: " + currentTrack);
        System.out.println("   State: " + currentState.getStateName());
        System.out.println();
    }
}

