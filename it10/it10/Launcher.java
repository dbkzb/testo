package it10;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Launcher {
public static Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
public static void main(String[] args) throws SecurityException, IOException {
	Launcher.initLogger();
	int a =10;
	int b=5;
	Logging c=new Logging();
	Launcher.logger.log(Level.INFO, "Calc is Ready");
	c.devide(a, b);
}
public static void initLogger () throws SecurityException, IOException {
	FileHandler fh = new FileHandler("log.xml");
		logger.addHandler(fh);
		logger.setLevel(Level.INFO);
		Launcher.logger.log(Level.SEVERE, "Logger is ready");
}
}
