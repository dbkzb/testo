package datetime;

import java.io.*;
import java.util.*;

public class Launcher {

	public static void main(String[] args) {

		try {

			System.out.println("Stoppuhr starten mit Eingabetaste!");
			System.in.read();
	
			// Determine start time.
			Date start = new Date();
			System.out.println("Startzeitpunkt: " + start);
			System.out.println();
	
			System.out.println("Die Stoppuhr laeuft ...");
			System.out.println();
	
			System.out.println("Stoppuhr anhalten mit Eingabetaste!");
			System.in.read();
	
			// Determine stop time.
			Date stop = new Date();
			System.out.println("Stoppzeitpunkt: " + stop);
			System.out.println();
	
			// Calculate difference.
			long laufzeit = stop.getTime() - start.getTime();
			System.out.println("Gesamtlaufzeit: " + laufzeit + " ms");

		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
