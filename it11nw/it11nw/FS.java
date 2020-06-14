package it11nw;

import java.io.File;

public class FS {
	
	public static void main(String[] args) {
		
		File f = new File("C:" + File.separator + "Program Files");
//		File f = new File("C:\\Program Files");
				
		if (f.isDirectory() == false) {
			
			System.out.println("Das Verzeichnis existiert nicht.");
			
		} else {
			
			File[] files = f.listFiles();
			
			for (File file : files) {
			
				System.out.println(file.getName());
				System.out.println(file.isDirectory());
				System.out.println(file.isHidden());
				System.out.println(file.canWrite());
				System.out.println(file.canRead());
				System.out.println(file.canExecute());
			}
			
			System.out.println("\n" + files.length);
			System.out.println(f.getFreeSpace());
		}
	}
}
