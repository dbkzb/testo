package logging;

import java.io.*;
import java.util.logging.*;

public class Launcher {

    // Find or create a logger for a named subsystem.
    // If a logger has already been created with the given name, it is returned.
    // Otherwise, a new logger is created.
    public static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    private static void initLogger() {

        try {

            FileHandler fh = new FileHandler("logging/division.xml");

            Launcher.logger.addHandler(fh);
            Launcher.logger.setLevel(Level.INFO);

        } catch (IOException e) {

            System.out.println("Error: The log file handler could not be created.");
        }
    }

    public static void main(String[] args) {

        Launcher.logger.info("Startup application.");
        
        initLogger();

        Launcher.logger.log(Level.FINE, "Prepare division.");
        
        int a = 5;
        int b = 0;
        Calculator c = new Calculator();
        
        try {

            c.divide(a, b);

        } catch (NullPointerException e) {

            Launcher.logger.log(Level.SEVERE, "The calculator is null.", e);
        }

        Launcher.logger.log(Level.INFO, "Shutdown application.");
    }
}
