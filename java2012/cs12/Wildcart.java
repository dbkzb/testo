package cs12;

import java.math.BigInteger;

public class Wildcart {
	public static void main(String[] args) {
	Zahlenpaar<Integer,Double> z1= new Zahlenpaar<Integer, Double>(12, 1.23);
	Zahlenpaar<BigInteger,Double> z2= new Zahlenpaar(new BigInteger("99999"), 1.23);
	Wildcart.print(z1);
	System.out.println(z1.summe());
	Wildcart.print(z2);
	System.out.println(z2.summe());
	}
	public static void print(Paar<?,?> p) {										//"?" ist eine sogenannte Wildcard 
		System.out.println("("+p.getZ1()+", "+p.getZ2()+")");
	}
}
