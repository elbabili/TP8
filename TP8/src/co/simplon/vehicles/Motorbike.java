package co.simplon.vehicles;

public class Motorbike extends Vehicle implements Motorized {

	public Motorbike(int id, String brand, String type, String engine) {
		super(id, brand, type, engine);
	}

	@Override
	public String toString() {
		return "Motorbike " + super.toString();
	}

	@Override
	public void fillUp() {
		// TODO Auto-generated method stub
		
	}	
}
