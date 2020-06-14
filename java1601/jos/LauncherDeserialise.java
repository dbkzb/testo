package jos;

import java.beans.*;
import java.io.*;
import java.text.*;

public class LauncherDeserialise {
    
    public static void read_dat(ObjectInputStream in, SimpleDateFormat f1, SimpleDateFormat f2) throws Exception {

        try {
            
            while (true) {
                
                Mitarbeiter m = (Mitarbeiter) in.readObject();
                Adresse a = m.getAdresse();
    
                System.out.println("Id: " + m.getId());
                System.out.println("Name: " + m.getName());
                System.out.println("Geburtsdatum: " + f1.format(m.getGeburtstag()));
                System.out.println(a.getStrasze());
                System.out.println(a.getPlz() + " " + a.getOrt());
                
                for (Kontakt k : m.getKontakte()) {
            	
                	System.out.println(k.getInformation() + " [" + f2.format(k.getTimestamp()) + "]");
                }
                
                System.out.println("Passwort: " + m.getPasswort());

                System.out.println();
            }
        
        } catch (EOFException e) {

            in.close();
        }
    }

    public static void read_xml(XMLDecoder in, SimpleDateFormat f1, SimpleDateFormat f2) throws Exception {

        try {
            
            while (true) {
                
                Mitarbeiter m = (Mitarbeiter) in.readObject();
                Adresse a = m.getAdresse();
    
                System.out.println("Id: " + m.getId());
                System.out.println("Name: " + m.getName());
                System.out.println("Geburtsdatum: " + f1.format(m.getGeburtstag()));
                System.out.println(a.getStrasze());
                System.out.println(a.getPlz() + " " + a.getOrt());
                
                for (Kontakt k : m.getKontakte()) {
            	
                	System.out.println(k.getInformation() + " [" + f2.format(k.getTimestamp()) + "]");
                }
                
                System.out.println("Passwort: " + m.getPasswort());

                System.out.println();
            }
        
        } catch (ArrayIndexOutOfBoundsException e) {

            in.close();
        }
    }

    public static void main(String[] args) throws Exception {
	
        FileInputStream fis1 = new FileInputStream("jos/mitarbeiter.dat");
        FileInputStream fis2 = new FileInputStream("jos/mitarbeiter.xml");
	ObjectInputStream in1 = new ObjectInputStream(fis1);
	XMLDecoder in2 = new XMLDecoder(fis2);

        SimpleDateFormat f1 = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat f2 = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        System.out.println("Read bytes:\n");
        read_dat(in1, f1, f2);
        System.out.println("Read xml:\n");
        read_xml(in2, f1, f2);
    }
}
