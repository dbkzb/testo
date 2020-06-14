package cs12;

public class OutputFormatting {
	public static void main(String[] args) {
		System.out.printf("%s %S%n%n", args[0], args[1]);
		for (int i = 0; i <= 15; i++) {
			System.out.printf("%d    ", i);
			System.out.printf("%X", i);
			System.out.println();
		}
		printName("Hans", "Müller", "Wolgograt", 98);
	}

	static void printName(String vorname, String nachname, String stadt, double alter) {
		System.out.printf("%-5s %-5s %5.3S %05.2f", vorname, nachname,stadt,alter);
	}

}
