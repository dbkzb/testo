package mapping;

public class DTO {

    public String ownerName;
    public String ownerCity;
    public String currencySymbol;
    public String currencyUnit;
    
    public String toString() {
    
        String s = new String();
        
        s = s + "The DTO has the following content:\n";
        s = s + "Owner name: " + this.ownerName + "\n";
        s = s + "Owner city: " + this.ownerCity + "\n";
        s = s + "Currency symbol: " + this.currencySymbol + "\n";
        s = s + "Currency unit: " + this.currencyUnit + "\n";
        
        return s;
    }
}
