package DAY_09;

public class UserLogic_Phone{

	public static void main(String[] args) {
		
		Phone p1 = new Phone("samsung","blue",20.000,null);
		p1.chat();
		p1.watch();
		p1.battery = "6000mh";
		System.out.println(p1.battery);
		System.out.println(p1.name);
//		System.out.println(p3.battery);
		
		
//		Phone p2 = new Phone("Apple", "Orange", 150000.00);
//		p2.chat();
//		System.out.println(p2.color);
//		
//		Phone p3 = new Phone();
//		p3.battery = "5000mh";
//		System.out.println(p3.battery);
//		
//		
//		Phone p4 = new Phone();
//		p4.color = "red";
		

	}
}
