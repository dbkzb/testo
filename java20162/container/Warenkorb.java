package container;

import java.util.*;

public class Warenkorb {
    
    private Vector<Artikel> liste;

    public Warenkorb() {

	this.liste = new Vector<Artikel>();
    }

    public void add(Artikel artikel) {
	
        this.liste.add(artikel);
    }

    public double berechneBestellwert() {
        
	double r = 0;
        
	for (Artikel a : this.liste) {
        
            r += a.getPreis() * a.getMenge();
        }

        return r;
    }

    /**
     * Alternative Lösung:
     * 
     * Object[] o = new Object[this.liste.size()];
     * this.liste.copyInto(o);
     * return java.util.Arrays.toString(o);
     */
    public String toString() {

	StringBuilder sb = new StringBuilder();
        sb.append("Warenkorb:\n");

        for (Artikel a : this.liste) {
        
            sb.append(a);
            sb.append("\n");
        }

        return sb.toString();
    }
}
