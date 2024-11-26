
import java.util.Arrays;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
    public static final int MAX_NUMBERS_ORDERED = 20;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered=0;
    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (qtyOrdered < MAX_NUMBERS_ORDERED) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("Đĩa đã được thêm");
        } else {
            System.out.println("Giỏ hàng gần đầy");
        }
    }
    
    
    //2.1 OVERLOADING BY differing type of parameter
    public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
    	int i=0;
    	 while (qtyOrdered < MAX_NUMBERS_ORDERED) {
             itemsOrdered[qtyOrdered+i] = dvdList[i];
             qtyOrdered++;
             System.out.println("Đĩa đã được thêm");
         }
    	 
          System.out.println("Giỏ hàng gần đầy");
    }
    
    //2.2 OVERLOADING BY DIFFERING OF NUMBER OF PARAMETER
    public void addDigitalVideoDisc(DigitalVideoDisc d1, DigitalVideoDisc d2) {
    	
    }
    
    
    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int n= -1;
        for (int i = 0; i < qtyOrdered; i++) {
            if (itemsOrdered[i] == disc) {
                n = i;
                break;
            }
        }
        if (n != -1) {
            for (int i = n; i < qtyOrdered - 1; i++) {
                itemsOrdered[i] = itemsOrdered[i + 1];
            }
            qtyOrdered--;
        } else {System.out.println("Không tìm thấy");
        }
    }
    public double totalCost() {
        double total = 0;
        for (int i = 0; i < qtyOrdered; i++) {
            total += itemsOrdered[i].getCost(); // Giả sử có phương thức getCost()
        }
        return total;
    }


	@Override
	public String toString() {
		String t = null;
		float totalCost=0;
		for(int i=0; i<qtyOrdered; i++) {
			t=t+i+". "+"DVD - "+itemsOrdered[i].getTitle()+" - "+itemsOrdered[i].getCategory()+" - "+itemsOrdered[i].getDirector()+" - "+itemsOrdered[i].getLength()+": "+itemsOrdered[i].getCost()+"$\n";
			totalCost+=itemsOrdered[i].getCost();
		}
		t+="Total cost: "+totalCost;
		return t;
	}
	
//	//print all disk in cart
//	public void print() {
//		System.out.println("****************CART**************\n");
//		System.out.println(toString());
//		System.out.println("**********************************\n");
//	}
//	
//	
//	//check matched disk
//	public boolean isMatching(String title) {
//		for (DigitalVideoDisc digitalVideoDisc : itemsOrdered) {
//			if(digitalVideoDisc.getTitle().equals(title)) {
//				return true;
//			}
//		}
//		return false;
//	}
	
    
    
}