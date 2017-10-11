
public abstract class Car {
private double price;
private String color;
private String mileage; 

public Car (double price) {
	this.price = price;
	this.color = color;
	//this.mileage = mileage;
}
	public double getPrice () {
	return price;
	

	}
	public String getColor () {
		return color;
		
	}
	public String getMileage () {
		return mileage;
	}
	
	public void setPrice (double price) {
		this.price = price;
		
	}
	public double getPrice (double price) {
		return price;
		
	}
	public void setColor (String color) {
		this.color = color; 
		
	}
	public void setMileage (String mileage) {
		this.mileage = mileage;
		
	}
}


