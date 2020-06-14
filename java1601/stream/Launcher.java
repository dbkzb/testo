package stream;

import java.io.*;
import java.net.*;
import java.util.*;

public class Launcher {

    public static void main(String[] args) {
	
        try {
            
            URL u = new URL("http://www.ba-leipzig.de/");
            URLConnection c = u.openConnection();
            InputStream is = c.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            Scanner in = new Scanner(isr);
            int count = 0;

            while (in.hasNext()) {
            
        	System.out.println(in.next());
                count++;
            }
            
            in.close();
            System.out.println("Number of tokens: " + count);
            
        } catch (Exception e) {
            
            e.printStackTrace();
        }
    }
}
