package datetime;

import java.io.*;
import java.util.*;

public class Launcher {

	public static void main(String[] args) {

		String a = args[0];
		File f = new File(a);
		long l = f.lastModified();
		Date d = new Date(l);
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(d);

		System.out.print("Letzte Änderung: ");

		System.out.println(c.get(Calendar.DATE)
			+ "."
			+ (c.get(Calendar.MONTH) + 1)
			+ "."
			+ c.get(Calendar.YEAR)
			+ " "
			+ c.get(Calendar.HOUR_OF_DAY)
			+ ":"
			+ c.get(Calendar.MINUTE)
			+ ":"
			+ c.get(Calendar.SECOND));
	}
}
