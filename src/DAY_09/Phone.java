package DAY_09;

public class Phone {
	
	
	// global variable // properties // attributes
	String name;
	String color;
	double price;
	String battery;
	
	// behavious // methods
	public void chat(){
		System.out.println("zaheer you can chat.....");
	}
	
	
	public void watch(){
		System.out.println("vedant you can watch the movies.....");
	}


	public Phone(String name, String color, double price,String battery) {
		super();
		this.name = name;
		this.color = color;
		this.price = price;
		this.battery = battery;
	}
	
	public Phone() {
		
	}



	
	
	
//	public Phone() {
//		
//	}
	
	
	
}
