package Java.facade_pattern.HomeTheater;

/**
 * Facade class that provides a simplified interface to the home theater subsystem.
 * 
 * This class hides the complexity of coordinating multiple components
 * (amplifier, DVD player, projector, screen, lights) behind simple methods
 * like watchMovie() and endMovie().
 */
public class HomeTheaterFacade {
    private Amplifier amp;
    private DvdPlayer dvd;
    private Projector projector;
    private Screen screen;
    private TheaterLights lights;

    public HomeTheaterFacade(Amplifier amp, DvdPlayer dvd, Projector projector, 
                            Screen screen, TheaterLights lights) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
    }

    /**
     * Simplified method to watch a movie.
     * This method coordinates all the subsystem components to start a movie.
     * Without the facade, the client would need to call multiple methods
     * on different objects in the correct order.
     */
    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        lights.on();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
        System.out.println("Movie started!");
    }

    /**
     * Simplified method to end a movie.
     * This method coordinates all the subsystem components to properly shut down.
     */
    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        lights.on();
        dvd.stop();
        dvd.eject();
        dvd.off();
        amp.off();
        projector.off();
        screen.up();
        System.out.println("Movie theater shut down complete!");
    }
}

