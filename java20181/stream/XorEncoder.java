package stream;

/**
 * Realisiert die XOR-Verschluesselung.
 */
public class XorEncoder extends Encoder {

	private int key;

	public XorEncoder(int key) {

		this.key = key;
	}

	public String encode(String s) {

		char[] c = s.toCharArray();

		// Wende auf die einzelnen Zeichen die XOR-Verschluesselung an
		for (int i = 0; i < c.length; i++) {

			c[i] = (char) (c[i] ^ this.key);
		}
		
		return new String(c);
	}

	public String decode(String s) {

		// Bei der einfachen XOR-Verschluesselung
		// sind Ver- und Entschluesselung identisch.
		// Daher wird hier die Methode encode verwendet.
		return encode(s);
	}
}
