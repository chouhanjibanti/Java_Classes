package DAY_12;

public class GhostRider {

	public static void main(String[] args) {
		
		Bike b1 = new Bike();
		System.out.println(b1.tS);
		System.out.println(b1.bN);
		b1.ride();
		System.out.println(b1.mileage);
		System.out.println(b1.noT);
		b1.transportation();
		
		
		System.out.println(b1.toString());
		System.out.println(b1.hashCode());
		
	}
}
