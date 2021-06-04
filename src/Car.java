
public class Car {
	private String name;
	private int price;
	
	public int getPrice() {
		return this.price;
	}
	public Car(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Car name: "+ name+" car price: "+ price;
	}

}
