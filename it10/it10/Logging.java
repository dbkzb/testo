package it10;

import java.util.logging.Level;

public class Logging {
	public int devide(int a, int b) {

		int ret = 0;
		if (b != 0) {
			try {
				ret = a / b;
				Launcher.logger.log(Level.SEVERE, "div zero");
			} catch (ArithmeticException e) {
				
			}
		}
		return ret;

	}
}
