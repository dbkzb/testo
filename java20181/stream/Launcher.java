package stream;

import java.util.*;

public class Launcher {

	public static void demo(Encoder e) {

		System.out.println("Eingabe zu verschlüsselnder Textzeile:");
		Scanner s = new Scanner(System.in);
		String line = s.nextLine();

		String encoded = e.encode(line);
		System.out.println("Verschluesselt: " + encoded);

		String decoded = e.decode(encoded);
		System.out.println("Entschluesselt: " + decoded);

		if (line.equals(decoded)) {

			System.out.println("Verschlüsselung erfolgreich.");

		} else {

			System.out.println("Fehler!");
		}

		s.close();
	}

	public static void main(String[] args) {

		System.out.println("Menue:\n"
			+ "===================================\n"
			+ "1 = XOR-Verschluesselung\n"
			+ "2 = Swap-Algorithmus\n"
			+ "===================================\n"
			+ "\n");
		System.out.println("Ihre Wahl:");

		Scanner s = new Scanner(System.in);
		int choice = s.nextInt();
		Encoder e = null;

		switch (choice) {

			case 1:
				System.out.println("Bitte Ganzzahl als Schluessel eingeben: ");
				int k = s.nextInt();
				e = new XorEncoder(k);
				Launcher.demo(e);
				break;
	
			case 2:
				e = new SwapEncoder();
				Launcher.demo(e);
				break;
	
			default:
				System.out.println("Ungueltige Auswahl!");
		}

		s.close();
	}
}
