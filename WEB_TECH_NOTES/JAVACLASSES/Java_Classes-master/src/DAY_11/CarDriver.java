package DAY_11;

public class CarDriver {

	public static void main(String[] args) {
		
		Car c = new Car("TATA", "BLACK", 100000.00, new Engine(500.00, 50000.0));
		
		c.e.combustion();
		c.drive();
		c.display();
		c.e.eDisplay();
	}
}
