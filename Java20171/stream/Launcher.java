package stream;

import java.io.*;

public class Launcher {

	public static void main(String[] args) {

		System.out.println("Startup.");

		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;

		try {

			fr = new FileReader("stream/in.txt");
			fw = new FileWriter("stream/out.txt");
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			String s = br.readLine();
			int c = 0;

			while (true) {

				if (s == null) {

					break;

				} else {

					System.out.println(c + ": " + s);

					bw.write(s);
					bw.newLine();

					s = br.readLine();
					c++;
				}
			}

			bw.write("And they all lived happily ever after.");
			bw.newLine();

		} catch (IOException e) {

			System.out.println("Error: " + e);

		} finally {

			try {

				if (br != null) {

					br.close();
				}

				if (bw != null) {

					bw.close();
				}
				
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

		System.out.println("Shutdown.");
	}
}
