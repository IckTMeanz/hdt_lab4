package hust.soict.dsai.test.store;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;
import hust.soict.dsai.aims.store.Store;

public class StoreTest {
	public static void main(String[] args) {
		Store st= new Store();
		for(int i=0; i<10; i++) {
			DigitalVideoDisc d= new DigitalVideoDisc("dvd"+i);
			st.addDVD(d);
		}
		
		st.removeDVD(new DigitalVideoDisc("dvd4"));
		
		
		//Check so luong xem da add or remove chua
		System.out.println(st.getNumberOfDisc());
	}
}
