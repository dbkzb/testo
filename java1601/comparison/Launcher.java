package comparison;

public class Launcher {

    public static void main(String[] args) {

	Die d1 = new Die();
	Die d2 = new Die();
	Die d3 = new Die(10);
	
	d1.roll();
	d2.roll();
	d3.roll();

	System.out.println("Vergleich der Würfel d1 und d2: " + d1.equals(d2));
	System.out.println("Würfel d3: " + d3);
    }
}
