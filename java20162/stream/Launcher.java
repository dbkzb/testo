package stream;

import java.io.*;
import java.nio.charset.*;
import java.util.zip.*;

public class Launcher {
    
    public static void main(String[] args) throws Exception {

	String s1 = "ääääääääää bbbbbbbb cccccc";
	byte[] ip1 = s1.getBytes();
	ByteArrayOutputStream op1 = new ByteArrayOutputStream(ip1.length);
	Deflater d = new Deflater();
	byte[] buffer = new byte[10];
	// The number of bytes of compressed data.
	int n = 0;

	d.setInput(ip1);
	// Indicate that compression should end.
	d.finish();

	while (!d.finished()) {
	    
	    n = d.deflate(buffer);
	    op1.write(buffer, 0, n);
	}

	System.out.println("The byte array has been compressed.");
	System.out.println("Original string size: " + s1.length());
	System.out.println("Original string size: " + s1);
	System.out.println("Original array size: " + ip1.length);
	System.out.println("Output stream size: " + op1.size());
	System.out.println("Output stream content: " + op1.toString());

	byte[] ip2 = op1.toByteArray();
	ByteArrayOutputStream op2 = new ByteArrayOutputStream(ip2.length);
	Inflater i = new Inflater();
	
	i.setInput(ip2, 0, ip2.length);

	while (!i.finished()) {

	    n = i.inflate(buffer);
	    op2.write(buffer, 0, n);
	}

	byte[] a = op2.toByteArray();
	String cs = Charset.defaultCharset().name();
	String s2 = new String(a, 0, a.length, cs);

	System.out.println("The byte array has been decompressed.");
	System.out.println("Output stream size: " + op2.size());
	System.out.println("Output stream content: " + op2.toString());
	System.out.println("Array size: " + a.length);
	System.out.println("Result string size: " + s2.length());
	System.out.println("Result string size: " + s2);

	op1.close();
    }
}
