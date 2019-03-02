package co.simplon.vehicles;

public class Car extends Vehicle implements Motorized {
	private int nbDoor;
	
	public Car(int id, String brand, String type, String engine,int nbDoor) {
		super(id, brand, type, engine);
		this.nbDoor = nbDoor;
	}

	@Override
	public String toString() {
		return "Car " + super.toString() + " nbDoor=" + nbDoor;
	}

	@Override
	public void fillUp() {
		// TODO Auto-generated method stub
		
	}	
}
