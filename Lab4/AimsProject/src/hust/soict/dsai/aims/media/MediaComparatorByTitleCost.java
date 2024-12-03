package hust.soict.dsai.aims.media;

import java.util.Comparator;

public class MediaComparatorByTitleCost implements Comparator<Media>{

	@Override
	public int compare(Media o1, Media o2) {
		// TODO Auto-generated method stub
		if(o1.getTitle().equals(o2.getTitle())) {
			return (int) (o1.getCost()-o2.getCost());
		}else return o1.getTitle().charAt(0)-o2.getTitle().charAt(0);
		
	}

}
