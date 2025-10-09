package DAY_06;

public class B {
	
	static int i = 10;

	public static void main(String[] args) {
		
		System.out.println("hy debugshala");
		
		System.out.println(A.i);
		A.run();
		System.out.println(i);
		
		A obj = new A();
		System.out.println(obj.j);
		obj.walk();
	}
}
