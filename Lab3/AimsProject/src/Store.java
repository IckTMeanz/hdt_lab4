
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Store {
	private DigitalVideoDisc[] itemsInStore;
	private int numberOfDisc=0;
	
	public int getNumberOfDisc() {
		return this.numberOfDisc;
	}
	
	//add 1 dvd in 1 time
	public void addDVD(DigitalVideoDisc dvd) {
		itemsInStore[numberOfDisc]=dvd;
		numberOfDisc++;
	}
	
	//remove 1 dvd in 1 time
	public void removeDVD(DigitalVideoDisc dvd) {
		for(int i=0; i<numberOfDisc; i++) {
			if(dvd.getTitle().equals(itemsInStore[i].getTitle())) {
				for(int j=i; j<numberOfDisc; j++) {
					itemsInStore[j]=itemsInStore[j+1];
				}
			}
		}
		numberOfDisc--;
	}
}
