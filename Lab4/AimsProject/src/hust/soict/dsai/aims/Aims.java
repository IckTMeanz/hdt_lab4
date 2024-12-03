package hust.soict.dsai.aims;


import java.util.Scanner;
import hust.soict.*;
import hust.soict.dsai.aims.store.Store;

public class Aims {
	
	public static void showMenu() {
		System.out.println("AIMS");
		System.out.println("----------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("Choose one number from: 0 - 1 - 2 - 3");
		
	}
	public static void storeMenu() { 

		System.out.println("Options: "); 
		System.out.println("--------------------------------"); 
		System.out.println("1. See a media’s details"); 
		System.out.println("2. Add a media to cart"); 
		System.out.println("3. Play a media"); 
		System.out.println("4. See current cart"); 
		System.out.println("0. Back"); 
		System.out.println("--------------------------------"); 
		System.out.println("Please choose a number: 0-1-2-3-4"); 
		} 
	
	public static void mediaDetailsMenu() { 
		System.out.println("Options: "); 
		System.out.println("--------------------------------"); 
		System.out.println("1. Add to cart"); 
		System.out.println("2. Play");
		System.out.println("0. Back"); 
		System.out.println("--------------------------------"); 
		System.out.println("Please choose a number: 0-1-2"); 
		} 
	
	public static void cartMenu() { 
		System.out.println("Options: "); 
		System.out.println("--------------------------------"); 
		System.out.println("1. Filter medias in cart"); 
		System.out.println("2. Sort medias in cart"); 
		System.out.println("3. Remove media from cart"); 
		System.out.println("4. Play a media"); 
		System.out.println("5. Place order"); 
		System.out.println("0. Back"); 
		System.out.println("--------------------------------"); 
		System.out.println("Please choose a number: 0-1-2-3-4-5"); 
		} 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		showMenu();
		int choose1= sc.nextInt();
		if(choose1==1) {
			storeMenu();
			int choose2=sc.nextInt();
			if(choose2==1) {
				mediaDetailsMenu();
				int choose3=sc.nextInt();
				if(choose3==1) {
					Store s = new Store();
					s.addData();
					System.out.println("After choose 1 to add to cart by ->ez");
				}else if(choose3==2) {
					Store s = new Store();
					s.addData();
					System.out.println("This function is not available");
					
				}
			}else if(choose2==4) {
				cartMenu();
				int choose5=sc.nextInt();
				if(choose5==2||choose5==1) {
					System.out.println("call 2 function of Cart class");
				}else if(choose5==5) {
					System.out.println("this function is not available");
				}
			}
		}

		
		

	}
	
}
