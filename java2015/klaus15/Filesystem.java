package klaus15;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public class Filesystem {
	public static void main(String[] args) {
		File f = new File("gedicht.txt");
		try {
			List<String> ls =FileUtils.readLines(f);
			for (String string : ls) {
				System.out.println(string.length());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		String z="klaus15/nonstop/../gedicht.txt";
		System.out.println(FilenameUtils.normalize(z));
		try {
			System.out.println(FileSystemUtils.freeSpaceKb());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
