package hust.soict.dsai.aims.media;

import java.util.Collection;
import java.util.Collections;

public abstract class Media{
	private int id;
	private String title;
	private String category;
	private float cost;
	
	public static final MediaComparatorByCostTitle CT = new MediaComparatorByCostTitle();
	public static final MediaComparatorByTitleCost TC = new MediaComparatorByTitleCost();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	
	//equals method by overriding Object class
	@Override
	public boolean equals(Object m) {
		Media n=(Media)m;
		if(this.title.equals(n.getTitle())) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}

