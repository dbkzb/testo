package datetime;

import java.util.*;
 
public class Launcher {
 
    public static void main(String[] args) {
     
	Calendar c = Calendar.getInstance();

	int wom = c.get(Calendar.WEEK_OF_MONTH);
	int woy = c.get(Calendar.WEEK_OF_YEAR);
	
        System.out.println("Current week of month: " + wom);
        System.out.println("Current week of year: " + woy);

        c.add(Calendar.WEEK_OF_MONTH, 1);
        
        System.out.println("Date: "
        	+ c.get(Calendar.DATE) + "-"
        	+ (c.get(Calendar.MONTH) + 1) + "-"
        	+ c.get(Calendar.YEAR));
    }
}
