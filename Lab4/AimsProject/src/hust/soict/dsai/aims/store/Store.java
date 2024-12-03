package hust.soict.dsai.aims.store;

import java.util.ArrayList;

import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.DigitalVideoDisc;
import hust.soict.dsai.aims.media.Disc;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;

public class Store {
	//private DigitalVideoDisc[] itemsInStore;
	private ArrayList<Media> itemsInStore= new ArrayList<Media>();
	private int numberOfMedia=0;
	
	public int getNumberOfMedia() {
		return this.numberOfMedia;
	}
	
	public void addData() {
		itemsInStore.add(new Book("book1"));
		itemsInStore.add(new Disc("Disc 2"));
		itemsInStore.add(new DigitalVideoDisc("videoDisc3"));
		for (Media media : itemsInStore) {
			System.out.println(media.getTitle());
		}
	}
	
	
	
	//Update addMedia
	public void addMedia(Media m) {
		itemsInStore.add(m);
		numberOfMedia++;
	}
	
	//Update removeMedia
	public void removeMedia(Media m) {
		for (Media media : itemsInStore) {
			if(media.getTitle().equals(m.getTitle())) {
				itemsInStore.remove(media);
			}
		}
		numberOfMedia--;
	}
}
