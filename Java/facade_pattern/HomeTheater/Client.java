package Java.facade_pattern.HomeTheater;

/**
 * Client class to demonstrate the Facade Pattern
 * 
 * FACADE PATTERN EXPLANATION:
 * ===========================
 * The Facade Pattern provides a simplified interface to a complex subsystem.
 * It hides the complexity of multiple subsystems behind a single, easy-to-use interface.
 * 
 * Key Components:
 * 1. Facade (HomeTheaterFacade) - Provides a simple interface to the complex subsystem
 * 2. Subsystem Classes (Amplifier, DvdPlayer, Projector, Screen, TheaterLights) - 
 *    The complex classes that the facade simplifies
 * 
 * Benefits:
 * - Simplifies complex subsystems
 * - Reduces coupling between client and subsystem
 * - Provides a single entry point to a subsystem
 * - Makes the subsystem easier to use
 * 
 * Use Cases:
 * - When you want to provide a simple interface to a complex subsystem
 * - When you want to decouple clients from subsystem components
 * - When you want to layer your subsystems (facade provides a higher-level interface)
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("=== FACADE PATTERN DEMONSTRATION ===\n");

        // Create subsystem components
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player");
        Projector projector = new Projector("Top-O-Line Projector");
        Screen screen = new Screen("Theater Screen");
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");

        // Create the facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector, screen, lights);

        System.out.println("--- Watching a Movie (Using Facade) ---");
        // The facade simplifies the complex process of starting a movie
        // Instead of calling multiple methods on different objects, we just call one method
        homeTheater.watchMovie("Inception");

        System.out.println("\n--- Ending the Movie (Using Facade) ---");
        // The facade also simplifies ending the movie
        homeTheater.endMovie();

        System.out.println("\n--- Without Facade (Complex Way) ---");
        // This is what you would have to do without the facade:
        System.out.println("Getting ready to watch a movie...");
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
        dvd.play("Inception");
        System.out.println("Movie started!\n");

        System.out.println("Ending the movie...");
        lights.on();
        dvd.stop();
        dvd.eject();
        dvd.off();
        amp.off();
        projector.off();
        screen.up();
        System.out.println("Movie ended!");

        System.out.println("\n--- Using Facade Again (Simple Way) ---");
        // With facade, it's just one method call!
        homeTheater.watchMovie("The Matrix");
        System.out.println();
        homeTheater.endMovie();
    }
}

