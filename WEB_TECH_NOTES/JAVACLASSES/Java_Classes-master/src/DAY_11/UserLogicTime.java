package DAY_11;

public class UserLogicTime {

	public static void main(String[] args) {
		
		ClockHms c1 = new ClockHms(11,50,55);
		
		c1.showTime();
		c1.setHr(12);
		c1.setMin(59);
		c1.setSec(58);
		c1.showTime();
		
		
		System.out.println(c1.getHr());
		System.out.println(c1.getMin());
		System.out.println(c1.getSec());
	}
}
