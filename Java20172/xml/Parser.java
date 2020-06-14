package xml;

import java.io.*;
import java.util.*;
import javax.xml.stream.*;
import javax.xml.stream.events.*;

public class Parser {

	static final String ITEM = "item";
	static final String YEAR = "year";
	static final String ARTIST = "artist";
	static final String TITLE = "title";
	static final String GENRE = "genre";

	Item item;
	String tagName;

	void processTagStart(StartElement e) {

		if (e.getName().getLocalPart().equals(Parser.ITEM)) {

			this.item = new Item();
			Iterator<Attribute> at = e.getAttributes();
			Attribute a = at.next();

			if (a.getName().toString().equals(Parser.YEAR)) {

				this.item.setYear(a.getValue());
			}

		} else if (e.getName().getLocalPart().equals(Parser.ARTIST)) {

			this.tagName = Parser.ARTIST;
		
		} else if (e.getName().getLocalPart().equals(Parser.TITLE)) {

			this.tagName = Parser.TITLE;
		
		} else if (e.getName().getLocalPart().equals(Parser.GENRE)) {

			this.tagName = Parser.GENRE;
		}
	}

	void processTagEnd(EndElement e, List<Item> l) {

		if (e.getName().getLocalPart().equals(Parser.ITEM)) {

			l.add(this.item);
		}
	}

	void processTagContent(Characters c) {
	
		if (!c.isWhiteSpace()) {

			String s = c.getData();
		
			if (this.tagName.equals(Parser.ARTIST)) {
	
				this.item.setArtist(s);
			
			} else if (this.tagName.equals(Parser.TITLE)) {
	
				this.item.setTitle(s);
			
			} else if (this.tagName.equals(Parser.GENRE)) {
	
				this.item.setGenre(s);
			}
		}
	}

	void processEvent(XMLEvent e, List<Item> l) {

		if (e.isStartElement()) {

			processTagStart(e.asStartElement());
		
		} else if (e.isEndElement()) {

			processTagEnd(e.asEndElement(), l);
		
		} else if (e.isCharacters()) {

			processTagContent(e.asCharacters());
		}
	}

	public List<Item> parseFile(String file) throws Exception {

		List<Item> l = new ArrayList<Item>();
		XMLInputFactory f = XMLInputFactory.newInstance();
		InputStream is = new FileInputStream(file);
		XMLEventReader r = f.createXMLEventReader(is);

		while (r.hasNext()) {

			XMLEvent e = r.nextEvent();
			processEvent(e, l);
		}

		return l;
	}
}
