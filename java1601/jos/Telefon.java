package jos;

import java.io.*;

public class Telefon extends Kontakt implements Serializable {
    
    private String telefonNummer;
    
    public String getTelefonNummer() {

	return this.telefonNummer;
    }

    public void setTelefonNummer(String telefonNummer) {
        
	this.telefonNummer = telefonNummer;
    }

    public String getInformation() {
        
	return "Telefon: " + this.telefonNummer;
    }
}
