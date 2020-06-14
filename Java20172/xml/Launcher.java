package xml;

import java.util.*;

public class Launcher {

	public static void main(String[] args) throws Exception {

		Parser p = new Parser();
		List<Item> l = p.parseFile("xml/repertoire.xml");

		for (Item i : l) {

			System.out.println(i);
		}
	}
}
