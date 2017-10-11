
public class OldCar extends Car {
	private int mileage;
	private double price;
	
	public OldCar (double price, int mileage) {
		super(price);
		this.price = price * 2;
		this.mileage = mileage;
	}
}
