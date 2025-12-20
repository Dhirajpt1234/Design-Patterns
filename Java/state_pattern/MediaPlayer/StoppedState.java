package Java.state_pattern.MediaPlayer;

/**
 * Concrete state representing the Stopped state of the Media Player.
 * When the player is in this state:
 * - play() starts playback and transitions to PlayingState
 * - pause() does nothing (cannot pause when stopped)
 * - stop() does nothing (already stopped)
 */
public class StoppedState implements State {
    @Override
    public void play(MediaPlayer player) {
        System.out.println("  ▶️  Starting playback...");
        player.setState(new PlayingState());
        System.out.println("  ✓ Player is now PLAYING: " + player.getCurrentTrack());
    }
    
    @Override
    public void pause(MediaPlayer player) {
        System.out.println("  ⚠️  Cannot pause! Player is stopped. Please play first.");
    }
    
    @Override
    public void stop(MediaPlayer player) {
        System.out.println("  ⏹️  Already stopped!");
    }
    
    @Override
    public String getStateName() {
        return "STOPPED";
    }
}

