package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media>{

	@Override
	public int compare(Media o1, Media o2) {
		// TODO Auto-generated method stub
		if(o1.getCost()==o2.getCost()) {
			return o1.getTitle().charAt(0)-o2.getTitle().charAt(0);
		}else return (int) (o1.getCost()-o2.getCost());
		
	}
	}


