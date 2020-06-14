package stream;

import java.io.*;

public class Launcher {

    public static void main(String[] args) throws IOException {
    
        System.out.println("Startup application.");

        FileInputStream fis = new FileInputStream(args[0]);
        FileOutputStream fos = new FileOutputStream(args[1]);
        PushbackInputStream in = new PushbackInputStream(fis);
        BufferedOutputStream out = new BufferedOutputStream(fos);

        // The loop count.
        int c;
        // The current byte.
        int b = in.read();
        // The next byte.
        int n;

        while (b != -1) {
        
            n = in.read();
            
            // Zählt die Anzahl gleicher Bytes b.
            for (c = 1; n != -1; c++) {
            
                if (b != n || c == 255) {
                
                    break;
                }
                
                n = in.read();
            }
            
            // Komprimierung nur bei mindestens 4 gleichen Bytes.
            if (c > 3) {
            
                out.write('@');
                out.write(b);
                // This number won't be readable in a text editor.
                // It is interpreted as ASCII character by the text editor.
                // But actually, its integer value points to some arbitrary
                // code in the ASCII table, e.g. a control code,
                // so that it is not readable when viewed in a text editor.
                out.write(c);
            
            } else {
            
                for (int i = 0; i < c; i++) {
                
                    out.write(b);
                }
            }

            // Letztes Byte n wird zurückgestellt,
            // da b != n bzw. c == 255.
            if (n != -1) {
            
                in.unread(n);
            }
                
            b = in.read();
        }
        
        in.close();
        out.close();

        System.out.println("Shutdown application.");
    }
}
