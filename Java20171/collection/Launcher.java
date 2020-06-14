package collection;

import java.util.*;

public class Launcher {
    
    public static void main(String[] args) {
        
        System.out.println("Startup");
        
        // The hashtable.
        Map<String,Double> m = new Hashtable<String,Double>();
        // The random value.
        double r = 0.0;
        // The double object.
        Double d = null;
        // The loop variable.
        int j = 0;
        
        while (true) {
        
            if (j == 10) {
            
                break;
            }
            
            r = Math.random();
            d = new Double(r);
            
            m.put("entry" + j, d);
            
            j++;
        }
        
        // Get all keys.
        Set<String> k = m.keySet();
        // The key iterator.
        Iterator<String> i = k.iterator();
        // The key string.
        String s = null;
        
        while (true) {
        
            if (i.hasNext() == false) {
            
                break;
            }
            
            s = i.next();
            
            if (s.equals("entry7")) {
            
                System.out.println("Found entry 7.");
                
                // The following will cause a "ConcurrentModificationException".
                // k.remove(s);
                // m.remove(s);
            }
        }
        
        m.remove("entry8");
        
        System.out.println("Map size: " + m.size() + " and content: " + m);
        
        System.out.println("Shutdown");
    }
}
