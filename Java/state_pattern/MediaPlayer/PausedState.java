package Java.state_pattern.MediaPlayer;

/**
 * Concrete state representing the Paused state of the Media Player.
 * When the player is in this state:
 * - play() resumes playback and transitions to PlayingState
 * - pause() does nothing (already paused)
 * - stop() transitions to StoppedState
 */
public class PausedState implements State {
    @Override
    public void play(MediaPlayer player) {
        System.out.println("  ▶️  Resuming playback...");
        player.setState(new PlayingState());
        System.out.println("  ✓ Player is now PLAYING: " + player.getCurrentTrack());
    }
    
    @Override
    public void pause(MediaPlayer player) {
        System.out.println("  ⏸️  Already paused! Current track: " + player.getCurrentTrack());
    }
    
    @Override
    public void stop(MediaPlayer player) {
        System.out.println("  ⏹️  Stopping playback...");
        player.setState(new StoppedState());
        System.out.println("  ✓ Player is now STOPPED");
    }
    
    @Override
    public String getStateName() {
        return "PAUSED";
    }
}

