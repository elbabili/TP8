package co.simplon.cars;

public class Motorbike extends Vehicle {

	public Motorbike(int id, String brand, String type, String engine) {
		super(id, brand, type, engine);
	}

	@Override
	public String toString() {
		return "Motorbike " + super.toString();
	}	
}
