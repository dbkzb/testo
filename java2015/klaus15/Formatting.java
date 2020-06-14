package klaus15;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class Formatting {
	public static void main(String[] args) {
		Double i = Double.valueOf(args[0]);
		Formatting.displayCurrency(i, Locale.GERMANY);
		Formatting.displayDate(Locale.GERMANY);
		Formatting.displayCurrency(i, Locale.FRANCE);
		Formatting.displayDate(Locale.FRANCE);
		Formatting.displayCurrency(i, Locale.US);
		Formatting.displayDate(Locale.US);

	}

	static void displayCurrency(Double i, Locale l) {
		NumberFormat n=DecimalFormat.getCurrencyInstance(l);
		System.out.println(n.format(i));
	}
	static void displayDate(Locale l) {
		DateFormat df=DateFormat.getDateInstance(DateFormat.SHORT,l);
		Date d=new Date();
		System.out.println(df.format(d));
		
	}
}
