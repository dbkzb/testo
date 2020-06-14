package datetime;

import java.util.*;

public class Launcher {

    public static void main(String[] args) {

        GregorianCalendar c = new GregorianCalendar(2000, 0, 1, 0, 0, 0);
        Date dt = c.getTime();
        long t1 = dt.getTime();
        long t2 = System.currentTimeMillis();
        long t = t2 - t1;

        // Convert milliseconds into seconds.
        t = t / 1000;
        // Calculate remaining seconds from minutes.
        long s = t % 60;

        // Convert seconds into minutes.
        t = t / 60;
        // Calculate remaining minutes from hours.
        long m = t % 60;

        // Convert minutes into hours.
        t = t / 60;
        // Calculate remaining hours from days.
        long h = t % 24;

        // Convert hours into days.
        t = t / 24;
        // Assign remaining time as days.
        long d = t;

        System.out.println("Time since 2000-01-01: " + d + " Tage, " + h + " Stunden, " + m + " Minuten, " + s + " Sekunden");
    }
}
