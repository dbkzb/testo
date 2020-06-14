package xml;

public class Item {

	private String year;
	private String artist;
	private String title;
	private String genre;

	public String getYear() {

		return this.year;
	}

	public void setYear(String year) {

		this.year = year;
	}

	public String getArtist() {

		return this.artist;
	}

	public void setArtist(String artist) {

		this.artist = artist;
	}

	public String getTitle() {

		return this.title;
	}

	public void setTitle(String title) {

		this.title = title;
	}

	public String getGenre() {

		return this.genre;
	}

	public void setGenre(String genre) {

		this.genre = genre;
	}

	@Override
	public String toString() {

		return "Item [year=" + this.year + ", artist=" + this.artist + ", title=" + this.title + ", genre=" + this.genre + "]";
	}
}
