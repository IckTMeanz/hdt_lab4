package hust.soict.dsai.aims.media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
	private String artist;
	private ArrayList<Track> tracks=new ArrayList<Track>();
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public CompactDisc() {
		
	}
	
	//addTrack method
	public boolean addTrack(Track tr) {
		for (Track track : tracks) {
			if(track==tr) {
				return false;
			}
		}
		tracks.add(tr);
		return true;
	}
	
	
	//removeTrack method
	public boolean removeTrack(Track tr) {
		for (Track track : tracks) {
			if(track==tr) {
				tracks.remove(tr);
				return true;
			}
		}
		return false;
	}
	
	//getLength method
	public int getLength() {
		int sum=0;
		for (Track track : tracks) {
			sum+=track.getLength();
		}
		return sum;
	}
	
	//play method
	@Override
	public void play() {
		// TODO Auto-generated method stub
		for (Track track : tracks) {
			track.play();
		}
	}
	
	
}

