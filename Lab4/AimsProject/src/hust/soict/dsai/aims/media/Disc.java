package hust.soict.dsai.aims.media;

public class Disc extends Media{
	private int length;
	private String Director;
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public String getDirector() {
		return Director;
	}
	public void setDirector(String director) {
		Director = director;
	}
	
	public Disc() {
		super();
	}
	
	public Disc(String title) {
		setTitle(title);
	}
}
