package Java.state_pattern.MediaPlayer;

/**
 * State interface that defines the behavior for different states of the Media Player.
 * Each state implements this interface to define how the player behaves in that state.
 * 
 * The State pattern allows the MediaPlayer to change its behavior when its internal state changes.
 * The player will appear to change its class when the state changes.
 */
public interface State {
    /**
     * Handles the play action based on the current state
     * @param player The media player context
     */
    void play(MediaPlayer player);
    
    /**
     * Handles the pause action based on the current state
     * @param player The media player context
     */
    void pause(MediaPlayer player);
    
    /**
     * Handles the stop action based on the current state
     * @param player The media player context
     */
    void stop(MediaPlayer player);
    
    /**
     * Returns the name of the current state
     * @return State name as a string
     */
    String getStateName();
}

