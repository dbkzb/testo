package it11;

import java.io.File;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Filesystem {
	public static void main(String[] args) throws IOException {
		File f=new File("it11/test.bin");

			RandomAccessFile RAF = new RandomAccessFile(f, "rw");
			RAF.writeChars("Hallo Welt");
			RAF.writeChars("Hier bin ich");
			RAF.close();
			RAF.seek(7);
			String test =RAF.readUTF();
			System.out.println(test);
			RAF.seek(0);
			test =RAF.readUTF();
			System.out.println(test);
			
	}
}
