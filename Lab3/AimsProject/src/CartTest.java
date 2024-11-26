
import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class CartTest {
	public static void main(String[] args) {
		Cart cart = new Cart();
		DigitalVideoDisc dvd1= new DigitalVideoDisc("The lion king", "Animation", "Roger allie1", 87, 19.5f);
		cart.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2= new DigitalVideoDisc("The lion king 2", "Animation", "Roger allie2", 88, 19.5f);
		cart.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3= new DigitalVideoDisc("The lion king 3", "Animation", "Roger allie3", 89, 19.5f);
		cart.addDigitalVideoDisc(dvd3);
		cart.print();
		
	}

}
