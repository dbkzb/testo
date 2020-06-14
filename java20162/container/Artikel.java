package container;

public class Artikel {
    
    private int id;
    private double preis;
    private int menge;

    public Artikel(int id, double preis, int menge) {
	
        this.id = id;
        this.preis = preis;
        this.menge = menge;
    }

    public int getId() {

	return this.id;
    }

    public void setId(int id) {
        
	this.id = id;
    }

    public double getPreis() {
        
	return this.preis;
    }

    public void setPreis(double preis) {
        
	this.preis = preis;
    }

    public int getMenge() {
        
	return this.menge;
    }

    public void setMenge(int menge) {
        
	this.menge = menge;
    }

    public String toString() {
        
	return this.id + " " + this.preis + " " + this.menge;
    }
}
