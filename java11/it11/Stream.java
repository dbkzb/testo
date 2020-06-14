package it11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Stream {
	public static void main(String[] args) throws IOException {
		int promp = 0;
		try {
			FileInputStream fis = new FileInputStream("Klaus_Sem2\ba_in.bmp");
			FileOutputStream fos = new FileOutputStream("it11/ba_out.bmp");
			int prom = fis.read();
			int b = 0;
			while (prom != -1) {
				switch (b) {
				case 22:
					prom = 110;
					break;
				case 23:
					prom = 0;
					break;
				case 24:
					prom = 0;
					break;
				case 25:
					prom = 0;
					break;
				case 58:
					prom = 0;
					break;
				case 59:
					prom = 0;
					break;
				case 60:
					prom = 255;
					break;
				default:
					break;
				}
				fos.write(prom);
				prom = fis.read();
				b++;
			}
			fis.close();
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
