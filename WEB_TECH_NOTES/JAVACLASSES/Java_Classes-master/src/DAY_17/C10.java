package DAY_17;

public class C10 implements I10 ,I20{

	@Override
	public void walk() {
	    System.out.println("from walk methods of c10");
	}

	@Override
	public void run() {
		System.out.println("from run methods of c10");	
	}

	@Override
	public void sleep() {
		System.out.println("from sleep methods of c10");
	}
	
	

}
