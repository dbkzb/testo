package container;

import java.io.*;
import java.util.*;

public class Launcher {
    
    public static void main(String[] args) throws Exception {
	
        File f = new File("container/gpl.txt");
        Scanner s = new Scanner(f);
        Map<String, Integer> m = new TreeMap<String, Integer>();
        String word = null;

        // Zusatzaufgabe: Einschränken der eingelesenen Zeichen.
        s.useDelimiter("[^a-zA-Z']+");

        while (s.hasNext()) {

            word = s.next();

            if (!m.containsKey(word)) {

        	// The first appearance.
                m.put(word, 1);

            } else {

        	// Following appearances.
                m.put(word, m.get(word) + 1);
            }
        }
        
        s.close();

        for (String w : m.keySet()) {
            
            System.out.println(w + "\t" + m.get(w));
        }

        System.out.println("Container size: " + m.size());
    }
}
