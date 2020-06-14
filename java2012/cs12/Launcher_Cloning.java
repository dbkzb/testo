package cs12;

import java.util.ArrayList;

public class Launcher_Cloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Mensa m1 = new Mensa();
		Kueche k1 = new Kueche();
		m1.kueche = k1;
		Raum r1 = new Raum();
		m1.speiseSaal = r1;
		m1.getraenkeBar = null;
		m1.angestellte = new ArrayList<Rolle>();
		m1.angestellte.add(new Koch());
		m1.angestellte.add(new TellerWaescher());
		Mensa m2 = null;
		m2 = m1.clone();
		System.out.println(m1.kueche);
		System.out.println(m2.kueche);

	}
}
