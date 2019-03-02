package co.simplon.cars;

public class Boat extends Vehicle {
	private int nbFloor;

	public Boat(int id, String brand, String type, String engine,int nbFloor) {
		super(id, brand, type, engine);
		this.nbFloor = nbFloor;
	}

	@Override
	public String toString() {
		return "Boat " +  super.toString() +  " nbFloor=" + nbFloor;
	}		
}
