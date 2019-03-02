package co.simplon.cars;

public class Car extends Vehicle {
	private int nbDoor;
	
	public Car(int id, String brand, String type, String engine,int nbDoor) {
		super(id, brand, type, engine);
		this.nbDoor = nbDoor;
	}

	@Override
	public String toString() {
		return "Car " + super.toString() + " nbDoor=" + nbDoor;
	}	
}
