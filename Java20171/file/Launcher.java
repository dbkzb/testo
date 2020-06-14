package file;

import java.io.*;

public class Launcher {
    
    public static void main(String[] args) {
        
        System.out.println("Startup.");

        File d = new File("file/blu/bla/testdir");
        // Create directory and all of its non-existent parent directories.
        d.mkdirs();

        if (d.isDirectory()) {
        
            System.out.println("The created directory is valid.");
            System.out.println("Its name is: " + d.getAbsolutePath());
            
            try {
            
                File f = new File("file/blu/bla/testdir/test.txt");
                f.createNewFile();

                File n = new File("file/blu/bla/testdir/newname.txt");
                f.renameTo(n);
                
            } catch (Exception e) {
            
                System.out.println("Error: The file creation failed.");
            }

        } else {

            System.out.println("Error: The directory creation failed.");
        }
    }
}
