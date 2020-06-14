package mapping;

public class Assembler {

    public DTO dto;
    public Account account;
    
    public void assemble() {
    
        this.dto.ownerName = this.account.owner.name;
        this.dto.ownerCity = this.account.owner.city;
        this.dto.currencySymbol = this.account.currency.symbol;
        this.dto.currencyUnit = this.account.currency.unit;
    }
    
    public void disassemble() {

        this.account.owner.name = this.dto.ownerName;
        this.account.owner.city = this.dto.ownerCity;
        this.account.currency.symbol = this.dto.currencySymbol;
        this.account.currency.unit = this.dto.currencyUnit;
    }
}
