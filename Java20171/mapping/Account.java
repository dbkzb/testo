package mapping;

public class Account {

    public Owner owner;
    public Currency currency;
    
    public Account() {
    
        this.owner = new Owner();
        this.currency = new Euro();
    }
}
