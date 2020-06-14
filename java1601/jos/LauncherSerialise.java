package jos;

import java.beans.*;
import java.io.*;
import java.util.*;

public class LauncherSerialise {
    
    public static void main(String[] args) throws Exception {

	FileOutputStream fos1 = new FileOutputStream("jos/mitarbeiter.dat");
	FileOutputStream fos2 = new FileOutputStream("jos/mitarbeiter.xml");
        ObjectOutputStream out1 = new ObjectOutputStream(fos1);
        XMLEncoder out2 = new XMLEncoder(fos2);

        Mitarbeiter m1 = new Mitarbeiter();
        Mitarbeiter m2 = new Mitarbeiter();
        Adresse a1 = new Adresse();
        Adresse a2 = new Adresse();
        List<Kontakt> k1 = new ArrayList<Kontakt>();
        List<Kontakt> k2 = new ArrayList<Kontakt>();
        Mail mail1 = new Mail();
        Mail mail2 = new Mail();
        Mail mail3 = new Mail();
        Telefon tel1 = new Telefon();
        Telefon tel2 = new Telefon();

        m1.setId(101);
        m1.setName("Meier, Hugo");
        m1.setGeburtstag(new GregorianCalendar(1970, 0, 1).getTime());
        m1.setAdresse(a1);
        m1.setKontakte(k1);
        m1.setPasswort("blubla");
        m2.setId(102);
        m2.setName("Schmitz, Otto");
        m2.setGeburtstag(new GregorianCalendar(1961, 2, 22).getTime());
        m2.setAdresse(a2);
        m2.setKontakte(k2);
        m2.setPasswort("blablu");

        a1.setStrasze("Hauptstr. 12");
        a1.setPlz("40880");
        a1.setOrt("Ratingen");
        a2.setStrasze("Dorfstr. 5");
        a2.setPlz("40880");
        a2.setOrt("Ratingen");

        k1.add(mail1);
        k1.add(tel1);
        k2.add(mail2);
        k2.add(mail3);
        k2.add(tel2);

        mail1.setTimestamp(new Date());
        mail1.setMailAdresse("hugo.meier@xyz.de");
        mail2.setTimestamp(new Date());
        mail2.setMailAdresse("otto.schmitz@web.de");
        mail3.setTimestamp(new Date());
        mail3.setMailAdresse("otto.schmitz@gmx.de");

        tel1.setTimestamp(new Date());
        tel1.setTelefonNummer("02102/112233");
        tel2.setTimestamp(new Date());
        tel2.setTelefonNummer("02102/445566");

        // Serialise data.
        out1.writeObject(m1);
        out1.writeObject(m2);
        out1.flush();
        out1.close();

        out2.writeObject(m1);
        out2.writeObject(m2);
        out2.flush();
        out2.close();
    }
}
