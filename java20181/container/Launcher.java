package container;

import java.util.*;
import java.util.Map.*;

public class Launcher {

	public static void main(String[] args) {

		HashMap<String, Double> m = new HashMap<String, Double>();

		m.put("Meier, August", 5000.0);
		m.put("Schmitz, Anton", 4500.0);
		m.put("Balder, Hugo", 4700.0);
		m.put("Schulze, Wolfgang", 4500.0);

		//
		// Variante 1: Schlüssel.
		//
		
		Set<String> ks = m.keySet();
		System.out.println("Gehaltstabelle:");

		for (String k : ks) {

			System.out.println(k + ": " + m.get(k));
		}

		System.out.println();

		//
		// Variante 2: Element bzw. Eintrag.
		//

		Set<Entry<String, Double>> es = m.entrySet();
		System.out.println("Gehaltstabelle:");

		for (Map.Entry<String, Double> e : es) {

			System.out.println(e.getKey() + ": " + e.getValue());
		}
	}
}
