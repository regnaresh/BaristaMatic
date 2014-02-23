package coffeedispenser;

import java.util.ArrayList;
import java.util.HashMap;

public class Dispenser {

	HashMap ingredients = new HashMap();
	ArrayList beverages = new ArrayList();
	Dispenser(String filename, String[] beverages) {
		
	}
	
	public void display() {}
	
	public Beverage getBeverage() { return new Mocha(); }
	
	public void reStock() {}
	
	public boolean dispense() { return true;}
	
}

