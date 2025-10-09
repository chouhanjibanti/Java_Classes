package DAY_08;

public class BikeUserLogic {

	
	public static void main(String[] args) {
		
		Bike b = new Bike();
		b.color = "blue";
		b.brand = "BMW";
		b.price = 600000.00;
		b.pickup();
		b.drop();
		
		Bike b1 = new Bike();
		b1.color = "red";
		b1.brand = "HONDA";
		b1.price = 100000.00;
		b1.pickup();
		b1.drop();
	}
}
