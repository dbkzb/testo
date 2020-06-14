package cs12;

import java.util.ArrayList;

public class Mensa implements Cloneable {
	public ArrayList<Rolle> angestellte;
	public Bar getraenkeBar;
	public Raum speiseSaal;
	public Kueche kueche;

	@Override
	protected Mensa clone() throws CloneNotSupportedException {
		Mensa m = (Mensa) super.clone();
		if (this.getraenkeBar != null) {
			m.getraenkeBar = (Bar) this.getraenkeBar.clone();
		}
		m.speiseSaal = (Raum) this.speiseSaal.clone();
		m.kueche = (Kueche) this.kueche.clone();
		m.angestellte = new ArrayList<Rolle>();
		for (Rolle rolle : angestellte) {
			m.angestellte.add((Rolle) rolle.clone());
		}
		return m;
	}
}
