package jos;

import java.io.*;

public class Mail extends Kontakt implements Serializable {
    
    private String mailAdresse;

    public String getMailAdresse() {

	return this.mailAdresse;
    }

    public void setMailAdresse(String mailAdresse) {
        
	this.mailAdresse = mailAdresse;
    }

    public String getInformation() {
        
	return "Mail: " + this.mailAdresse;
    }
}
