
public class UsedCar extends Car {
	private int mileage
;
	private double price;
	public UsedCar (double price, int mileage) {
		super (price);
		this.mileage = mileage;
		this.price = price * 2;
		
		
	}
	
	public int mileage() {
		return mileage;
		
	}
	

	public void mileage(int mileage) {
		this.mileage = mileage;
	}
	
	public boolean equals(Car Used2) {

		boolean objectsEqual;
		boolean condition1 = this.getPrice() == (Used2.getPrice());
		boolean condition2 = this.getMileage() == (Used2.getMileage());
		if (condition1 && condition2 ) {
			objectsEqual = true;
		} else {
			objectsEqual = false;
		}
		return objectsEqual;
	}

	public void display() {
		System.out.println("price = $" + this.getPrice() + "0, mileage = " + mileage);
	}

}

	
