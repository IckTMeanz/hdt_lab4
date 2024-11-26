package hust.soict.dsai.test.disc;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
	public static void main(String[] args) {
		DigitalVideoDisc nghia1 = new DigitalVideoDisc("nghia1");
		DigitalVideoDisc nghia2 = new DigitalVideoDisc("nghia2");
		
		swap(nghia1, nghia2);
		System.out.println("nghia 1 title: "+nghia1.getTitle());
		System.out.println("nghia 2 title: "+nghia2.getTitle());
		
		changeTitle(nghia1,  nghia2.getTitle());
		System.out.println("nghia 1 title: "+nghia1.getTitle());
	}

public static void swap(Object o1, Object o2) {
	Object tmp=o1;
	o1=o1;
	o2=tmp;
}

public static void changeTitle(DigitalVideoDisc dvd, String title) {
	String oldTitle = dvd.getTitle();
	dvd.setTitle(title);
	dvd=new DigitalVideoDisc(oldTitle);
}
}
