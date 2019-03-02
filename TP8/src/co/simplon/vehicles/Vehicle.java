package co.simplon.vehicles;

public class Vehicle {
	private int id;
	private String brand;
	private String type;
	private String engine;
	
	public Vehicle(int id, String brand, String type, String engine) {
		this.id = id;
		this.brand = brand;
		this.type = type;
		this.engine = engine;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "id=" + id + ", brand=" + brand + ", type=" + type + ", engine=" + engine;
	}

}
