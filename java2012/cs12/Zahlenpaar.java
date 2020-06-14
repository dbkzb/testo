package cs12;

public class Zahlenpaar<T extends Number, U extends Number> extends Paar<T, U>{

	public Zahlenpaar(T z1, U z2) {
		super(z1, z2);
		
	}
public double summe(){
	
	return z1.doubleValue()+z2.doubleValue();
	
}
}
