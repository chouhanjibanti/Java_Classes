package DAY_11;

public class Engine {

	double hp;
	double price;
	
	public Engine(double hp, double price) {
		super();
		this.hp = hp;
		this.price = price;
	}
	
	public void combustion() {
		System.out.println("Dru Dru Dru........");
	}
	
	public void eDisplay() {
		System.out.println("hp of engine :"+hp);
		System.out.println("price of engine :"+price);
	}
}
