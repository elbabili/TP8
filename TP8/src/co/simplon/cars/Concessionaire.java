package co.simplon.cars;

import java.util.ArrayList;
import java.util.Iterator;

public class Concessionaire {
	private ArrayList<Vehicle> stock;
	
	public Concessionaire() {
		stock = new ArrayList<Vehicle>(); 
	}
	
	public void addVehicle(Vehicle v) {
		stock.add(v);
	}
	
	public boolean sellVehicle(int id) {	
		boolean ok = false;
		Iterator<Vehicle> it = stock.iterator();
		while(it.hasNext()) {
			if(it.next().getId() == id) {
				it.remove();
				ok = true;
				break;
			}
		}
		return ok;
	}
	
	public void displayStock() {
		Iterator<Vehicle> it = stock.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
