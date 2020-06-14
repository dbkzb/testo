package jos;

import java.io.*;
import java.util.*;

public class Mitarbeiter implements Serializable {

    private int id;
    private String name;
    private Date geburtstag;
    private Adresse adresse;
    private List<Kontakt> kontakte;
    private transient String passwort;

    public int getId() {

	return this.id;
    }

    public void setId(int id) {

	this.id = id;
    }

    public String getName() {

	return this.name;
    }

    public void setName(String name) {
        
	this.name = name;
    }

    public Date getGeburtstag() {
        
	return this.geburtstag;
    }

    public void setGeburtstag(Date geburtstag) {
        
	this.geburtstag = geburtstag;
    }

    public Adresse getAdresse() {
        
	return this.adresse;
    }

    public void setAdresse(Adresse adresse) {
        
	this.adresse = adresse;
    }

    public List<Kontakt> getKontakte() {
        
	return this.kontakte;
    }

    public void setKontakte(List<Kontakt> kontakte) {
        
	this.kontakte = kontakte;
    }

    public String getPasswort() {
    
	return this.passwort;
    }

    public void setPasswort(String passwort) {

	this.passwort = passwort;
    }
}
