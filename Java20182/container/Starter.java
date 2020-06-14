package container;

public class Starter {

	public static void main(String[] args) {

		Socke s1 = new Socke();
		Socke s2 = new Socke();
		GenerischesPaar<Socke> sockenPaar = new GenerischesPaar<Socke>(s1, s2);
		System.out.println("1. Paar: " + sockenPaar);

		Ohrring o1 = new Ohrring();
		Ohrring o2 = new Ohrring();
		GenerischesPaar<Ohrring> ohrringPaar = new GenerischesPaar<Ohrring>(o1, o2);
		System.out.println("2. Paar: " + ohrringPaar);

		Socke s = sockenPaar.getL();
		System.out.println(s);

		// Compile error message:
		// The constructor GenerischesPaar<Socke>(Ohrring, Socke) is undefined
		// GenerischesPaar<Socke> mix = new GenerischesPaar<Socke>(o1, s); // unzulaessig
	}
}
