package stream;

import java.io.*;
import java.util.*;

public class Launcher {

    public static void main(String[] args) throws Exception {

        String s = "stream/history.txt";
        FileWriter fw = new FileWriter(s);
        PrintWriter pw = new PrintWriter(fw);

        try {

            pw.println("Call History:");
            pw.println("");
            pw.format("Call by %s %s at local time: %tT\n", args[0], args[1], Calendar.getInstance());
            pw.format("Call by %s %s at local time: %tT\n", args[2], args[3], Calendar.getInstance());
            pw.format("Call by %s %s at local time: %tT\n", args[4], args[5], Calendar.getInstance());

        } finally {

            if (pw != null) {

                pw.close();
            }
        }
    }
}
