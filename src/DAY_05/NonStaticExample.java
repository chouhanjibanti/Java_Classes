package DAY_05;

public class NonStaticExample {

	
//	int i = 10;
//	boolean b = false;
//	
//	public static void main(String[] args) {
//		
//		System.out.println("hello");
//		 
//		NonStaticExample p1 = new NonStaticExa	mple();
//		System.out.println(p1.i);
//		System.out.println(p1.b);
//	}
	
	
	static int i = 10;
	int j = 100;
	
	public void nonStaticMethod() {
		System.out.println("hy");
	}
	
	public static void main(String[] args) {
		System.out.println("hello");
		
		NonStaticExample obj = new NonStaticExample();
		System.out.println(obj.j);
		
		
		obj.nonStaticMethod();
		System.out.println(obj.i);
		System.out.println(i);
		System.out.println(NonStaticExample.i);
		System.out.println("Method end");
		
	}
	
	
	
	
}


// loading process of an object.

// 1. new operator createa an object having an address.
// 2. load all the non sttaic memer with the defualt value.
// 3. execute all the non static initlizlier from top to bottom 
// 4. returnn the address once instancilatuon is compledt.






