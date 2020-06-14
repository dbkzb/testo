package cloning;

public class Launcher {

    public static void main(String[] args) {
    
        Kunde k1 = new Kunde("Hugo Meier", "Hauptstr. 12, 40880 Ratingen");
        Konto kto1 = new Konto(4711, 10000.0);
        
        kto1.setKunde(k1);
        
        // Tiefe Kopie.
        Konto kto2 = kto1.clone();

        // Änderung des in kto1 referenzierten Kunde-Objekts.
        k1.setAdresse("Hauptstr. 42, 40880 Ratingen");
        
        System.out.println("Konto 1:");
        System.out.println(kto1.getId());
        System.out.println(kto1.getSaldo());
        System.out.println(kto1.getKunde().getName());
        System.out.println(kto1.getKunde().getAdresse());

        System.out.println();

        System.out.println("Konto 2:");
        System.out.println(kto2.getId());
        System.out.println(kto2.getSaldo());
        System.out.println(kto2.getKunde().getName());
        System.out.println(kto2.getKunde().getAdresse());
    }
}
