package jos;

import java.io.*;

public class Adresse implements Serializable {

    private String strasze;
    private String plz;
    private String ort;

    public String getStrasze() {
    
	return this.strasze;
    }

    public void setStrasze(String strasse) {
        
	this.strasze = strasse;
    }

    public String getPlz() {
        
	return this.plz;
    }

    public void setPlz(String plz) {
        
	this.plz = plz;
    }

    public String getOrt() {
        
	return this.ort;
    }

    public void setOrt(String ort) {
        
	this.ort = ort;
    }
}
