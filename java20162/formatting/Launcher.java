package formatting;

import java.text.*;
import java.util.*;

public class Launcher {
    
    public static void main(String[] args) {
	
	Set<Currency> s = Currency.getAvailableCurrencies();

	for (Currency c : s) {

	    System.out.println(c.getDisplayName(Locale.GERMAN) + " - " + c.getNumericCode() + " - " + c.getSymbol());
	}

	NumberFormat f = DecimalFormat.getCurrencyInstance(Locale.GERMANY);
	
	// 12 345,68 €
	System.out.println(f.format(12345.6789));
    }
}
