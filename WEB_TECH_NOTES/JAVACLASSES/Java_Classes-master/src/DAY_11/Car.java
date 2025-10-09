package DAY_11;

public class Car {

	String model;
	String color;
	double price;
	Engine e;
	
	public Car(String model, String color, double price, Engine e) {
		super();
		this.model = model;
		this.color = color;
		this.price = price;
		this.e = e;
	}
	
	public void drive() {
		System.out.println("go to palasiya.....");
	}
	
	public void display() {
		System.out.println("model of car :"+model);
		System.out.println("color of car :"+color);		
		System.out.println("price of car :"+price);
		System.out.println("engine details :"+e);
	}
	
	
}
