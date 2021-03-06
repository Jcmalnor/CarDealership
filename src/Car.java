
public class Car {
	private String make;
	private String model;
	private int year;
	private double price;
	
	public String printCarDetails(Car c) {
		String details = (c.getMake() + "\t" + c.getModel() + "\t" + c.getYear() + "\t($" + c.getPrice() +") ");
		return details;
	}
	
	public Car(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public double getPrice() {
		return price;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
