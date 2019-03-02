package co.simplon.vehicles;

public class Boat extends Vehicle implements Motorized,Sailing {
	private int nbFloor;

	public Boat(int id, String brand, String type, String engine,int nbFloor) {
		super(id, brand, type, engine);
		this.nbFloor = nbFloor;
	}

	@Override
	public String toString() {
		return "Boat " +  super.toString() +  " nbFloor=" + nbFloor;
	}

	@Override
	public void fillUp() {
		// TODO Auto-generated method stub
		System.out.println("mon bateau a besoin de faire le plein");
	}

	@Override
	public void navigate() {
		// TODO Auto-generated method stub
		System.out.println("mon bateau navigue aussi avec ses belles voiles");
	}		
}
