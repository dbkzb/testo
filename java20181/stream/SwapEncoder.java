package stream;

/**
 * Verschluesselt einen String.
 * Vertauscht paarweise jeweils zwei Zeichen.
 * Fuegt zwischen diese ein weiteres zufaelliges Zeichen ein.
 */
public class SwapEncoder extends Encoder {

	public String encode(String s) {

		char[] c = s.toCharArray();
		String r = "";

		// Wende den Algorithmus immer auf zwei Zeichen an
		for (int i = 0; i < (c.length - 1); i = i + 2) {

			char c1 = c[i]; // das erste Zeichen
			char c2 = c[i + 1]; // das zweite Zeichen
			// Bestimme ein drittes, zufaelliges Zeichen
			char c3 = (char) ('a' + 26 * Math.random());

			// Tausche c2, c1 und fuege c3 dazwischen
			r = r + c2 + c3 + c1;
		}

		// Falls die Laenge des Feldes ungerade war,
		// so wurde ein Zeichen uebersehen
		if ((c.length % 2) != 0) {

			// Fuege vergessenes Zeichen hinzu
			r = r + c[c.length - 1];
		}
		
		return r;
	}

	public String decode(String s) {

		char[] c = s.toCharArray();
		String r = "";
		
		// Wende den Algorithmus immer auf drei Zeichen an
		for (int i = 0; i < (c.length - 2); i = i + 3) {

			// Zuerst das Zeichen c1 von Stelle 3
			r = r + c[i + 2];
			// Dann das Zeichen c2
			r = r + c[i];
			// Das Zeichen c3 entfaellt
		}

		// Pruefe, ob ein Zeichen uebersehen wurde
		if ((c.length % 3) != 0) {
		
			r = r + c[c.length - 1];
		}

		return r;
	}
}
