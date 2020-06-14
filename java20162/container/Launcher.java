package container;

public class Launcher {
    
    public static void main(String[] args) {

	Warenkorb w = new Warenkorb();
	
        w.add(new Artikel(4711, 10.0, 1));
        w.add(new Artikel(4712, 20.0, 2));
        w.add(new Artikel(4713, 30.0, 3));
        
        System.out.println(w);
        System.out.println("Bestellwert: " + w.berechneBestellwert());
    }
}
