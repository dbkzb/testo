package cloning;

public class Konto implements Cloneable {

    private int id;
    private double saldo;
    private Kunde kunde;

    public Konto() {}
    
    public Konto(int id, double saldo) {
    
        this.id = id;
        this.saldo = saldo;
    }
    
    public void setId(int ktoId) {
    
        this.id = ktoId;
    }
    
    public int getId() {
    
        return this.id;
    }
    
    public void setSaldo(double saldo) {
    
        this.saldo = saldo;
    }
    
    public double getSaldo() {
    
        return this.saldo;
    }
    
    public void setKunde(Kunde kd) {
    
        this.kunde = kd;
    }
    
    public Kunde getKunde() {
    
        return this.kunde;
    }
    
    public void add(double betrag) {
    
        this.saldo += betrag;
    }
    
    @Override
    public boolean equals(Object o) {
    
        boolean b = false;
        
        if ((o instanceof Konto) && (this.id == ((Konto) o).id)) {
        
            b = true;
        }

        return b;
    }

    @Override
    public int hashCode() {

        return this.id % 100;
    }

    // Überschreibt "protected Object clone()"
    @Override
    public Konto clone() {
    
        try {
        
            Konto k = (Konto) super.clone();
            
            // Kopiere zusammengesetzte Attribute (tiefe Kopie).
            k.kunde = new Kunde(this.kunde);

            return k;
        
        } catch (CloneNotSupportedException e) {
        
            // InternalError ist Subklasse von Error
            throw new InternalError();
        }
    }
}
