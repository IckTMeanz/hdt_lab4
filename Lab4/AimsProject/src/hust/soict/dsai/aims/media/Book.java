package hust.soict.dsai.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	private List<String> authors= new ArrayList<String>();
	
	public Book() {
		
	}
	
	public Book(String title) {
		setTitle(title);
	}

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}
	
	public boolean addAuthor(String authorName) {
		for (String string : authors) {
			if (string.equals(authorName)){
				return false;
			}
		}
		authors.add(authorName);
		return true;
	}
	
	public boolean removeAuthor(String authorName) {
		for (String string : authors) {
			if (string.equals(authorName)){
				authors.remove(authorName);
				return true;
			}
		}
		return false;
	}

}
