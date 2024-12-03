package hust.soict.dsai.aims.media;

public class Track implements Playable{
	private String title;
	private int length;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public Track() {
		
	}
	
	//play method
	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("Playing DVD: " + this.getTitle());
		System.out.println("DVD length: " + this.getLength());
	}
	
	//equals method by overriding Object class
	@Override
	public boolean equals(Object o) {
		Track t=(Track)o;
		if(this.length==t.getLength()&&this.title.equals(t.getTitle())) {
			return true;
		}else return false;
	}
}
