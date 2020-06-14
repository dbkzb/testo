package file;

import java.io.*;
import java.util.*;
import java.util.logging.*;

public class Launcher {

    // Find or create a logger for a named subsystem.
    // If a logger has already been created with the given name, it is returned.
    // Otherwise, a new logger is created.
    public static final Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    private static void initLogger() {

        try {

            FileHandler fh = new FileHandler("file/log.xml");

            Launcher.logger.addHandler(fh);
            Launcher.logger.setLevel(Level.INFO);

        } catch (IOException e) {

            System.out.println("Error: The log file handler could not be created.");
        }
    }

    public static void main(String[] args) {
	
        Launcher.initLogger();

        try {
	    
            Launcher.logger.log(Level.INFO, "Read input file.");
            
	    File f = new File("file/scores.dat");
	    Scanner s = new Scanner(f);

	    while (s.hasNext()) {
		
		System.out.printf("\t| %s\t| %d\t|\n", s.next(), s.nextInt());
	    }

	    s.close();
	    
	} catch (IOException e) {
	    
            Launcher.logger.log(Level.SEVERE, "The calculator is null.", e);
	}
    }
}
