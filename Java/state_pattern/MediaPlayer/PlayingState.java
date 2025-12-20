package Java.state_pattern.MediaPlayer;

/**
 * Concrete state representing the Playing state of the Media Player.
 * When the player is in this state:
 * - play() does nothing (already playing)
 * - pause() transitions to PausedState
 * - stop() transitions to StoppedState
 */
public class PlayingState implements State {
    @Override
    public void play(MediaPlayer player) {
        System.out.println("  ⏯️  Already playing! Current track: " + player.getCurrentTrack());
    }
    
    @Override
    public void pause(MediaPlayer player) {
        System.out.println("  ⏸️  Pausing playback...");
        player.setState(new PausedState());
        System.out.println("  ✓ Player is now PAUSED");
    }
    
    @Override
    public void stop(MediaPlayer player) {
        System.out.println("  ⏹️  Stopping playback...");
        player.setState(new StoppedState());
        System.out.println("  ✓ Player is now STOPPED");
    }
    
    @Override
    public String getStateName() {
        return "PLAYING";
    }
}

